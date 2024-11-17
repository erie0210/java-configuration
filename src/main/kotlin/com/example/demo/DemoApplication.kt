package com.example.demo

import com.example.demo.component.Dependency1
import com.example.demo.configuration.AppConfig
import org.springframework.beans.factory.getBean
import org.springframework.boot.runApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext

// @ComponentScan("com.example.demo")
class DemoApplication

// fun main(args: Array<String>) {
//    val ctx = AnnotationConfigApplicationContext(AppConfig::class.java)
//    val myService = ctx.getBean<MyService>()
//    myService.doStuff()
//
//    runApplication<DemoApplication>(*args)
// }

fun main(args: Array<String>) {
    val ctx = AnnotationConfigApplicationContext()
    ctx.register(AppConfig::class.java)

    runApplication<DemoApplication>(*args) {
        setApplicationContextFactory {
            ctx
        }
    }

    val dependency1 = ctx.getBean<Dependency1>()
    println(ctx.beanDefinitionNames.joinToString("\n"))
    dependency1.doStuff()
}
