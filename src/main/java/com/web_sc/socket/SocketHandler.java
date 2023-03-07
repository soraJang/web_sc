package com.web_sc.socket;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class SocketHandler extends TextWebSocketHandler {
    ObjectMapper objectMapper = new ObjectMapper();
    ChatRoomRepository repository = new ChatRoomRepository();

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String payload = message.getPayload();
        ChatMessage chatMessage = objectMapper.readValue(payload, ChatMessage.class);
        ChatRoom chatRoom = repository.getChatRoom(chatMessage.getChatRoomId());
        chatRoom.handleMessage(session, chatMessage, objectMapper);

    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        repository.remove(session);

    }
}
