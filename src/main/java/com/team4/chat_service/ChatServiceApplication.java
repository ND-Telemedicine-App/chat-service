package com.team4.chat_service;

import com.team4.chat_service.model.Chat;
import com.team4.chat_service.repo.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatServiceApplication implements CommandLineRunner {
    @Autowired
    ChatRepository chatRepository;

    public static void main(String[] args) {
        SpringApplication.run(ChatServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Chat newChat1 = new Chat(1L, 4L, 1L, "10:17PM", "Hello doctor");
        chatRepository.save(newChat1);

        Chat newChat2 = new Chat(2L, 1L, 4L, "10:18PM", "Hello patient");
        chatRepository.save(newChat2);

        Chat newChat3 = new Chat(3L, 4L, 1L, "10:19PM", "I would like to have my prescription.");
        chatRepository.save(newChat3);

        Chat newChat4 = new Chat(4L, 1L, 4L, "10:20PM", "You should have Paracetamol as 2 tabs per day!");
        chatRepository.save(newChat4);

        Chat newChat5 = new Chat(5L, 4L, 1L, "10:20PM", "Thank you sir!");
        chatRepository.save(newChat5);

    }
}
