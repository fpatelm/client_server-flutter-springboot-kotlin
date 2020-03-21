package com.example.faizal.demosprintbot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.example.faizal")
class DemoSprintbotApplication

fun main(args: Array<String>) {
	SpringApplication.run(DemoSprintbotApplication::class.java, *args)
}