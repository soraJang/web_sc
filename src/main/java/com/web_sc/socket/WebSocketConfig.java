package com.web_sc.socket;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
//@EnableWebSocketMessageBroker
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    SocketHandler socketHandler = new SocketHandler();
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(socketHandler, "/send").setAllowedOrigins("*").withSockJS();
    }
//
//    @Override
//    // 클라이언트가 메시지를 구독할 endpoint를 정의합니다.
//    public void configureMessageBroker(MessageBrokerRegistry config) {
//        config.enableSimpleBroker("/send");
//    }
//
//    @Override
//    // connection을 맺을때 CORS 허용합니다.
//    public void registerStompEndpoints(StompEndpointRegistry registry) {
//        registry.addEndpoint("/")
//                // 스프링 5.3, 스프링부트 2.4 버전 부터 allowCredentials이 true인 경우 setAllowedOrigins 메서드에서
//                // 와일드 카드 `'*'`을 사용하실 수 없습니다.
//                //  	.setAllowedOrigins("*")
//                .setAllowedOriginPatterns("*")
//                .withSockJS();
//    }
}
