package com.hustleaddiction.chat.chat_api.application.services.messageService;

import com.hustleaddiction.chat.chat_api.application.dtos.SendMessageRequestDto;
import com.hustleaddiction.chat.chat_api.domain.conversation.Conversation;
import com.hustleaddiction.chat.chat_api.domain.conversation.Message;
import com.hustleaddiction.chat.chat_api.insfrastructure.repositories.ConversationRepository;
import com.hustleaddiction.chat.chat_api.insfrastructure.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
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
                LocalDateTime.now(),
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
}
