package com.hustleaddiction.chat.chat_api.application.services.messageService;

import com.hustleaddiction.chat.chat_api.application.dtos.SendMessageRequestDto;
import com.hustleaddiction.chat.chat_api.domain.aggregate.conversaion.Conversation;
import com.hustleaddiction.chat.chat_api.domain.aggregate.conversaion.Message;
import com.hustleaddiction.chat.chat_api.insfrastructure.repositories.ConversationRepository;
import com.hustleaddiction.chat.chat_api.insfrastructure.repositories.MessageRepository;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class MessageService implements IMessageService
{
    @Autowired
    private ConversationRepository conversationRepository;

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public Message sendMessage(SendMessageRequestDto request)
    {
        if (request.getUserId() == null)
        {
            throw new IllegalArgumentException("User ID is required");
        }

        Optional<Conversation> conversationOpt = conversationRepository.findByUserId(request.getUserId());

        Conversation conversation = conversationOpt.orElseGet(() ->
        {
            Conversation newConversation = new Conversation(
                request.getUserId(),
                "event",
                UUID.randomUUID()
            );
            return conversationRepository.save(newConversation);
        });

        Message message = new Message(
            conversation.getId(),
            request.getSenderType(),
            request.getMessageType(),
            request.getContent(),
            LocalDateTime.now()
        );

        return messageRepository.save(message);
    }

    public List<Message> getMessages(
        UUID conversationId,
        int offset,
        int limit)
    {
        if (limit <= 0)
        {
            limit = 10;
        }
        int page = offset / limit;
        Pageable pageable = PageRequest.of(page, limit);
        Page<Message> messagePage = messageRepository
            .findByConversationId(conversationId, pageable);
        return messagePage.getContent();
    }

}
