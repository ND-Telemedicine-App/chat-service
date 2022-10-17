package com.team4.chat_service.model;


import javax.persistence.*;

@Entity
@Table(name = "chat")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Long senderId;

    @Column private Long receiverId;

    @Column private String time;

    @Column private String text;

    public Chat() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public Long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Chat(Long id, Long senderId, Long receiverId, String time, String text) {
        this.id = id;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.time = time;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "id=" + id +
                ", senderId=" + senderId +
                ", receiverId=" + receiverId +
                ", time='" + time + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

}
