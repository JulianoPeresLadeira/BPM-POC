package com.waes.bpmserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BpmServerApplication

fun main(args: Array<String>) {
    runApplication<BpmServerApplication>(*args)
}
