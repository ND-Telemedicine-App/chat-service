package com.team4.chat_service.controller;

import com.team4.chat_service.model.Chat;
import com.team4.chat_service.service.ChatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

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

    @GetMapping(value = "chat/sender/{senderId}")
    public Set<Long> getReceiverBasedOnSender(@PathVariable Long senderId){
        return chatService.findReceiverBasedOnSender(senderId);
    }

    @GetMapping(value = "/chats")
    public List<Chat> getAllChats(){
        return chatService.findAllChats();
    }

    @GetMapping(value = "/chat/latest/{senderId}/{receiverId}")
    public Chat getLatestChat(@PathVariable Long senderId, @PathVariable Long receiverId){
        return chatService.findLatestChat(senderId, receiverId);
    }

    @PostMapping(value = "/send")
    public void sendNewChat(@RequestBody Chat newChat){
        chatService.createNewChat(newChat);
    }
}
