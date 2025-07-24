package com.hustleaddiction.chat.chat_api.domain.aggregate.chat;

import com.hustleaddiction.chat.chat_api.domain.seedWork.EntityBase;
import com.hustleaddiction.chat.chat_api.domain.seedWork.IAggregateRoot;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;

import java.sql.Types;
import java.util.UUID;

@Entity
@Table(name = "conversation")
public class Conversation extends EntityBase implements IAggregateRoot
{
    @Column(columnDefinition = "CHAR(36)", nullable = false)
    @JdbcTypeCode(Types.VARCHAR)
    private UUID userId;

    private String contextType;

    @Column(columnDefinition = "CHAR(36)", nullable = false)
    @JdbcTypeCode(Types.VARCHAR)
    private UUID contextId;

    public Conversation()
    {
    }

    public Conversation(
        UUID userId,
        String contextType,
        UUID contextId)
    {
        this.userId = userId;
        this.contextType = contextType;
        this.contextId = contextId;
    }

    public UUID getUserId()
    {
        return userId;
    }

    public void setUserId(UUID userId)
    {
        this.userId = userId;
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
