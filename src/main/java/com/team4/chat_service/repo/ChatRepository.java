package com.team4.chat_service.repo;

import com.team4.chat_service.model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {
    List<Chat> findChatsBySenderIdAndReceiverId(Long senderId, Long receiverId);

    List<Chat> findChatsBySenderId(Long senderId);

}
