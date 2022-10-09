package com.team4.chat_service.service;


import com.team4.chat_service.model.Chat;
import com.team4.chat_service.repo.ChatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {
    private final ChatRepository chatRepository;

    public ChatService(ChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }

    public List<Chat> findChatsBySenderIdAndReceiverId(Long senderId, Long receiverId){
        return chatRepository.findChatsBySenderIdAndReceiverId(senderId, receiverId);
    }




}
