package com.team4.chat_service.service;


import com.team4.chat_service.model.Chat;
import com.team4.chat_service.repo.ChatRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ChatService {
    private final ChatRepository chatRepository;

    public ChatService(ChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }

    public List<Chat> findChatsBySenderIdAndReceiverId(Long senderId, Long receiverId){
        return chatRepository.findChatsBySenderIdAndReceiverId(senderId, receiverId);
    }

    public Chat findLatestChat(Long senderId, Long receiverId){
        List<Chat> allChat = new ArrayList<>();
        List<Chat> senderToReceiver = chatRepository.findChatsBySenderIdAndReceiverId(senderId, receiverId);
        List<Chat> receiverToSender = chatRepository.findChatsBySenderIdAndReceiverId(receiverId, senderId);
        allChat.addAll(senderToReceiver);
        allChat.addAll(receiverToSender);
        Long large = 0L;
        int index = 0;
        Chat res = new Chat();
        for(int i = 0; i < allChat.size(); i++){
            if (allChat.get(i).getId() > large){
                large = allChat.get(i).getId();
                index = i;
            }
        }
        return allChat.get(index);
    }

    public void createNewChat(Chat newChat){
        chatRepository.save(newChat);
    }

    public List<Chat> findAllChats(){
        return chatRepository.findAll();
    }


    public Set<Long> findReceiverBasedOnSender(Long senderId){
        List<Chat> chatList = chatRepository.findChatsBySenderId(senderId);
        Set<Long> receiverList = new HashSet<>();
        for (Chat chat : chatList) {
            receiverList.add(chat.getReceiverId());
        }
        return receiverList;
    }




}
