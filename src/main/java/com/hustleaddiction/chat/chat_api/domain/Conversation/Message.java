package com.hustleaddiction.chat.chat_api.domain.Conversation;

import com.hustleaddiction.chat.chat_api.domain.Conversation.Enum.MessageType;
import com.hustleaddiction.chat.chat_api.domain.Conversation.Enum.SenderType;

import java.time.LocalDateTime;
import java.util.UUID;

public class Message
{
    private UUID id;
    private UUID conversationId;
    private SenderType senderType;
    private MessageType messageType;
    private String content;
    private LocalDateTime timestamp;

    public Message(
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
    public void setId(UUID id)
    {
        this.id = id;
    }

    public UUID getConversationId()
    {
        return conversationId;
    }
    public void setConversationId(UUID conversationId)
    {
        this.conversationId = conversationId;
    }

    public SenderType getSenderType()
    {
        return senderType;
    }
    public void setSenderType(SenderType senderType)
    {
        this.senderType = senderType;
    }

    public MessageType getMessageType()
    {
        return messageType;
    }
    public void setMessageType(MessageType messageType)
    {
        this.messageType = messageType;
    }

    public String getContent()
    {
        return content;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public LocalDateTime getTimestamp()
    {
        return timestamp;
    }
    public void setTimestamp(LocalDateTime timestamp)
    {
        this.timestamp = timestamp;
    }
}
