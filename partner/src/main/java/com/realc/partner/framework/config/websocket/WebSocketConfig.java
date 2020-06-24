package com.realc.partner.framework.config.websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @author EDZ
 */
@Configuration
public class WebSocketConfig {

    @Bean
    public ServerEndpointExporter ServerEndpointExporter(){
        return new ServerEndpointExporter();
    }
}
