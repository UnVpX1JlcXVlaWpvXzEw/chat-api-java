package com.hustleaddiction.chat.chat_api.domain.SeedWork;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public abstract class EntityBase {
    private Date creationDate;
    private long id;
    private Date modificationDate;
    private UUID uuid;

    protected EntityBase() {
        this.uuid = UUID.randomUUID();
    }

    // Getters and Setters
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid)
    {
        this.uuid = uuid;
    }
}
