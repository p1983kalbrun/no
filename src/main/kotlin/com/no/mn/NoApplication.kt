package com.no.mn

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NoApplication

fun main(args: Array<String>) {
    runApplication<SpringRestSeedApplication>(*args)
}
