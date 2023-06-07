package com.web_sc.controller;

import com.web_sc.service.SocketService;
import com.web_sc.vo.SocketVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class SocketController {

    @Autowired
    SocketService socketService;


    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/hello/{roomId}")
    public SocketVO greeting(@DestinationVariable("roomId") String roomId, SocketVO message) throws Exception {
        simpMessagingTemplate.convertAndSend("/topic/" + roomId , message);
        return message;
    }

    @MessageMapping("/hello")
    public SocketVO greeting(SocketVO message) throws Exception {
        simpMessagingTemplate.convertAndSend("/topic" , message);
        return message;
    }
}

