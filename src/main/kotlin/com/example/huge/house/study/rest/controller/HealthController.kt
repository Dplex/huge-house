package com.example.huge.house.study.rest.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins = ["*"])
class HealthController {

    var i = 0

    @GetMapping("/health")
    @ResponseBody
    fun health(): String{
        return "Success"
    }

    @GetMapping("/hello")
    @ResponseBody
    fun hello(): ResponseEntity<String> {
        print(i)
        print(i)
        print(i)
        i += 1
        return ResponseEntity.ok("$i")
    }
}