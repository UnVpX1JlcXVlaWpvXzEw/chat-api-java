package com.hustleaddiction.chat.chat_api.api.controllers;

import com.hustleaddiction.chat.chat_api.application.dtos.SendMessageRequestDto;
import com.hustleaddiction.chat.chat_api.domain.conversation.Message;
import com.hustleaddiction.chat.chat_api.application.services.messageService.MessageService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat/messages")
public class ChatController
{
    @Autowired
    private MessageService messageService;

    @PostMapping("/send")
    public Message sendMessage(@Valid @RequestBody SendMessageRequestDto request) {

        return messageService.sendMessage(request);
    }
}
