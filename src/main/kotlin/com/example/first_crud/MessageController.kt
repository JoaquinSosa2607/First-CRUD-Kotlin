package com.example.first_crud

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController{
    @GetMapping("/")
    fun index(@RequestParam("name") name: String) = "Hi, $name!"
}