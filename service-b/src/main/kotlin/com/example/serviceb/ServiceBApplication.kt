package com.example.serviceb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.*

@SpringBootApplication
class ServiceBApplication

fun main(args: Array<String>) {
    runApplication<ServiceBApplication>(*args)
}

@RestController
class HelloController {
    @GetMapping("/")
    fun hello() = "Hello from Service B"
}