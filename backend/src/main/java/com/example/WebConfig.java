package com.example.hotelbooking;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // allow all paths
                .allowedOrigins("http://localhost:5173") // React dev server
                .allowedMethods("*") // allow all HTTP methods (GET, POST, etc.)
                .allowedHeaders("*"); // allow all headers
    }
}
