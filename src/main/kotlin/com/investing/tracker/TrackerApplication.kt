package com.investing.tracker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TrackerApplication

fun main(args: Array<String>) {
	runApplication<TrackerApplication>(*args)
}
