package com.mowbro.weatherservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    @GetMapping("/")
    fun name() : Test {
        return Test("testda")
    }
}
data class Test(val name: String)

