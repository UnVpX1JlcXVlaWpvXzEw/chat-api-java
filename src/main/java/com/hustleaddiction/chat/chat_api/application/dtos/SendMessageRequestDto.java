package com.hustleaddiction.chat.chat_api.application.dtos;

import com.hustleaddiction.chat.chat_api.domain.conversation.enums.MessageType;
import com.hustleaddiction.chat.chat_api.domain.conversation.enums.SenderType;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public class SendMessageRequestDto
{
    @NotNull
    private UUID userId;
    private String content;
    private MessageType messageType;
    private SenderType senderType;

    public UUID getUserId()
    {
        return userId;
    }

    public void setUserId(UUID userId)
    {
        this.userId = userId;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public MessageType getMessageType()
    {
        return messageType;
    }

    public void setMessageType(MessageType messageType)
    {
        this.messageType = messageType;
    }

    public SenderType getSenderType()
    {
        return senderType;
    }

    public void setSenderType(SenderType senderType)
    {
        this.senderType = senderType;
    }
}
