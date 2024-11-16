package com.example.demo

import com.example.demo.component.Dependency1
import org.springframework.beans.factory.getBean
import org.springframework.boot.runApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext

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
    ctx.scan("com.example.demo")
    ctx.refresh()

    val dependency1 = ctx.getBean<Dependency1>()
    dependency1.doStuff()

    runApplication<DemoApplication>(*args)
}
