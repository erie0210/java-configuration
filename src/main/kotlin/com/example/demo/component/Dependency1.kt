package com.example.demo.component

import org.springframework.stereotype.Component

@Component
class Dependency1 {
    fun doStuff() {
        println("I'm injected Dependency HaHaHa!")
    }
}
