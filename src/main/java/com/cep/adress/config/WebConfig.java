package com.cep.adress.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/endereco")
                        .allowedOrigins("http://127.0.0.1:5500") // Permite todas as origens
                        .allowedMethods("*") // Permite todos os métodos HTTP
                        .allowedHeaders("*"); // Permite todos os cabeçalhos
            }
        };
    }
}
