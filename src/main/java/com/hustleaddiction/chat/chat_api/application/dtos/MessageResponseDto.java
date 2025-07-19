package com.hustleaddiction.chat.chat_api.application.dtos;

import com.hustleaddiction.chat.chat_api.domain.conversation.enums.MessageType;
import com.hustleaddiction.chat.chat_api.domain.conversation.enums.SenderType;
import java.time.LocalDateTime;
import java.util.UUID;

public class MessageResponseDto
{
    private UUID id;
    private UUID conversationId;
    private SenderType senderType;
    private MessageType messageType;
    private String content;
    private LocalDateTime timestamp;

    public MessageResponseDto(
            UUID id,
            UUID conversationId,
            SenderType senderType,
            MessageType messageType,
            String content,
            LocalDateTime timestamp)
    {
        this.id = id;
        this.conversationId = conversationId;
        this.senderType = senderType;
        this.messageType = messageType;
        this.content = content;
        this.timestamp = timestamp;
    }

    public UUID getId()
    {
        return id;
    }

    public UUID getConversationId()
    {
        return conversationId;
    }

    public SenderType getSenderType()
    {
        return senderType;
    }

    public MessageType getMessageType()
    {
        return messageType;
    }

    public String getContent()
    {
        return content;
    }

    public LocalDateTime getTimestamp()
    {
        return timestamp;
    }
}
