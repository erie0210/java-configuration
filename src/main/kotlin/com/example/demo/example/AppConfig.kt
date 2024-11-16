package com.example.demo.example

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AppConfig {
    @Bean
    fun myService(): MyService = MyService()
}
