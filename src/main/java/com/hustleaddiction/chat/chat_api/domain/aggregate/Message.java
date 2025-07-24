package com.hustleaddiction.chat.chat_api.domain.aggregate;

import com.hustleaddiction.chat.chat_api.domain.aggregate.enums.MessageType;
import com.hustleaddiction.chat.chat_api.domain.aggregate.enums.SenderType;
import com.hustleaddiction.chat.chat_api.domain.seedWork.EntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import java.sql.Types;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "message")
public class Message extends EntityBase
{
    @Column(columnDefinition = "CHAR(36)", nullable = false)
    @JdbcTypeCode(Types.VARCHAR)
    private UUID conversationId;

    @Enumerated(EnumType.STRING)
    private SenderType senderType;

    @Enumerated(EnumType.STRING)
    private MessageType messageType;

    private String content;

    private LocalDateTime timestamp;

    public Message()
    {
    }

    public Message(
        UUID conversationId,
        SenderType senderType,
        MessageType messageType,
        String content,
        LocalDateTime timestamp)
    {
        this.conversationId = conversationId;
        this.senderType = senderType;
        this.messageType = messageType;
        this.content = content;
        this.timestamp = timestamp;
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
