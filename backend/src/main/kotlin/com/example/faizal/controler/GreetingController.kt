package com.example.faizal.controler

import com.example.faizal.data.Greeting
import com.example.faizal.data.Title
import org.springframework.http.HttpHeaders
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong


@RestController
class GreetingController {

    val counter = AtomicLong()



    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): ResponseEntity<Greeting> {
    val responseHeaders = HttpHeaders()
    responseHeaders["Access-Control-Allow-Origin"] = "*"
    return ResponseEntity.ok().headers(responseHeaders)
            .body(Greeting(counter.incrementAndGet(), "Hello, $name"))
    }

    @GetMapping("/title")
    fun title(): ResponseEntity<Title> {
        val responseHeaders = HttpHeaders()
        responseHeaders["Access-Control-Allow-Origin"] = "*"
        return ResponseEntity.ok().headers(responseHeaders)
                .body(Title("App Title example Faizal"))
    }
}