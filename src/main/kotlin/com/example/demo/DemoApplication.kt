package com.example.demo

import com.example.demo.example.AppConfig
import com.example.demo.example.MyService
import org.springframework.beans.factory.getBean
import org.springframework.boot.runApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class DemoApplication

fun main(args: Array<String>) {
    val ctx = AnnotationConfigApplicationContext(AppConfig::class.java)
    val myService = ctx.getBean<MyService>()
    myService.doStuff()

    runApplication<DemoApplication>(*args)
}
