package com.chat.App.controller;

import com.chat.App.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController
{
@MessageMapping("/sendMessage")
    @SendTo("/topic/message")
    public Message sendMessage(Message message){

        return message;
    }
    @GetMapping
    public String chat()
    {
    return "chat";
    }


}
