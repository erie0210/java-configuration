package com.example.demo.configuration

import com.example.demo.service.MyService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AppConfig {
    @Bean
    fun myService(): MyService = MyService()
}
