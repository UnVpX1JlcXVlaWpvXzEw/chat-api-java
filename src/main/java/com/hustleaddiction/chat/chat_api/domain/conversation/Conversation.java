package com.hustleaddiction.chat.chat_api.domain.conversation;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;

import java.sql.Types;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "conversation")
public class Conversation
{
    @Id
    @Column(columnDefinition = "CHAR(36)")
    @JdbcTypeCode(Types.VARCHAR)
    private UUID id;

    @Column(columnDefinition = "CHAR(36)", nullable = false)
    @JdbcTypeCode(Types.VARCHAR)
    private UUID userId;

    private LocalDateTime createdAt;

    private String contextType;

    @Column(columnDefinition = "CHAR(36)", nullable = false)
    @JdbcTypeCode(Types.VARCHAR)
    private UUID contextId;

    public Conversation()
    {
    }

    public Conversation(
        UUID id,
        UUID userId,
        LocalDateTime createdAt,
        String contextType,
        UUID contextId)
    {
        this.id = id;
        this.userId = userId;
        this.createdAt = createdAt;
        this.contextType = contextType;
        this.contextId = contextId;
    }

    public UUID getId()
    {
        return id;
    }

    public void setId(UUID id)
    {
        this.id = id;
    }

    public UUID getUserId()
    {
        return userId;
    }

    public void setUserId(UUID userId)
    {
        this.userId = userId;
    }

    public LocalDateTime getCreatedAt()
    {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt)
    {
        this.createdAt = createdAt;
    }

    public String getContextType()
    {
        return contextType;
    }

    public void setContextType(String contextType)
    {
        this.contextType = contextType;
    }

    public UUID getContextId()
    {
        return contextId;
    }

    public void setContextId(UUID contextId)
    {
        this.contextId = contextId;
    }
}
