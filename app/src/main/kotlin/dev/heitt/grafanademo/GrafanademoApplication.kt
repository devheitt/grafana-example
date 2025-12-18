package dev.heitt.grafanademo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GrafanademoApplication

fun main(args: Array<String>) {
	runApplication<GrafanademoApplication>(*args)
}
