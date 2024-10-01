package com.openmpy.foodiehub

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FoodieHubApplication

fun main(args: Array<String>) {
    runApplication<FoodieHubApplication>(*args)
}
