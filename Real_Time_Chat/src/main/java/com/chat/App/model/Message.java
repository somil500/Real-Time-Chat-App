package com.chat.App.model;

import lombok.Data;
import lombok.NoArgsConstructor;

public class Message
{
    private  Long id;
    private String sender;
    private String content;

    public Message() {
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
