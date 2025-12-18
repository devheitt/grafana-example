package dev.heitt.grafanademo

import io.micrometer.core.instrument.Counter
import io.micrometer.core.instrument.MeterRegistry
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(private val registry: MeterRegistry) {

    private val counter: Counter = Counter.builder("hello.count")
        .description("Contador de saludos")
        .tag("key", "value")
        .register(registry)

    @GetMapping("/hello")
    fun greet(): ResponseEntity<String> {
        counter.increment()

        return ResponseEntity.ok("Hello!")
    }
}