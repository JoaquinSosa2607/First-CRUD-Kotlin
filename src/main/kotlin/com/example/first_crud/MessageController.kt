package com.example.first_crud

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController{
    @GetMapping("/")
    fun listMessages() = listOf(
        Message("1", "Hola!"),
        Message("2", "Hello!"),
        Message("3", "Bonjour!")
    )
}