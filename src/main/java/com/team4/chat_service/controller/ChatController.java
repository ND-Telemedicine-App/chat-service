package com.team4.chat_service.controller;

import com.team4.chat_service.model.Chat;
import com.team4.chat_service.service.ChatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping(value = "/chat/{senderId}/{receiverId}")
    public List<Chat> getChats(@PathVariable Long senderId, @PathVariable Long receiverId){
        return chatService.findChatsBySenderIdAndReceiverId(senderId, receiverId);
    }
}
