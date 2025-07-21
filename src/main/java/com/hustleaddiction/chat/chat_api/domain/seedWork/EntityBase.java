package com.hustleaddiction.chat.chat_api.domain.seedWork;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;

import java.sql.Types;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass
public abstract class EntityBase
{
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date modificationDate;

    @Id
    @Column(columnDefinition = "CHAR(36)")
    @JdbcTypeCode(Types.VARCHAR)
    private UUID id;

    protected EntityBase()
    {
        this.id = UUID.randomUUID();
    }

    @PrePersist
    protected void onCreate()
    {
        this.creationDate = new Date();
        this.modificationDate = new Date();
    }

    @PreUpdate
    protected void onUpdate()
    {
        this.modificationDate = new Date();
    }

    public UUID getId()
    {
        return id;
    }

    public void setId(UUID id)
    {
        this.id = id;
    }

    public Date getCreationDate()
    {
        return creationDate;
    }

    public void setCreationDate(Date creationDate)
    {
        this.creationDate = creationDate;
    }

    public Date getModificationDate()
    {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate)
    {
        this.modificationDate = modificationDate;
    }
}
