package com.hustleaddiction.chat.chat_api.api.controllers;

import com.hustleaddiction.chat.chat_api.application.dtos.SendMessageRequestDto;
import com.hustleaddiction.chat.chat_api.domain.conversation.Message;
import com.hustleaddiction.chat.chat_api.application.services.messageService.MessageService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/chat")
public class ChatController
{
    @Autowired
    private MessageService messageService;

    @PostMapping("/messages/send")
    public Message sendMessage(@Valid @RequestBody SendMessageRequestDto request) {

        return messageService.sendMessage(request);
    }

    @GetMapping("/{conversationId}/messages")
    public List<Message> getMessages(
        @PathVariable UUID conversationId,
        @RequestParam(defaultValue = "0") int offset,
        @RequestParam(defaultValue = "10") int limit)
    {
        return messageService
            .getMessages(conversationId, offset, limit);
    }
}
