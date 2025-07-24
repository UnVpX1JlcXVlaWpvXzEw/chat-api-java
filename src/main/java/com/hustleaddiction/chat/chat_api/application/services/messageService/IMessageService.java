package com.hustleaddiction.chat.chat_api.application.services.messageService;

import com.hustleaddiction.chat.chat_api.application.dtos.SendMessageRequestDto;
import com.hustleaddiction.chat.chat_api.domain.aggregate.Message;

public interface IMessageService
{
    Message sendMessage(SendMessageRequestDto request);
}
