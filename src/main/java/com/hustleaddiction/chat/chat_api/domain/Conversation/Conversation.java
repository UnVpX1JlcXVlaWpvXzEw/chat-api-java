package com.hustleaddiction.chat.chat_api.domain.Conversation;

import java.time.LocalDateTime;
import java.util.UUID;

public class Conversation
{
    private UUID id;
    private UUID userId;
    private LocalDateTime createdAt;
    private String contextType;
    private UUID contextId;

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
