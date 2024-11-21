package br.edu.atitus.paradigma.api_gateway_service;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
               
                .route("saudacao_service", r -> r.path("/saudacao-service/**")
                        
                        .uri("http://localhost:8081"))
                
                
                .route("cambio_service", r -> r.path("/cambio-service/**")
                        
                        .uri("http://localhost:8100"))
                
                
                .route("produto_service", r -> r.path("/produto-service/**")
                        
                        .uri("http://localhost:8200"))
                
                .build();
    }
}
