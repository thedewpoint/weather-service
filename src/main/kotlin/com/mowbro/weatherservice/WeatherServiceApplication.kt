package com.mowbro.weatherservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WeatherServiceApplication

fun main(args: Array<String>) {
	runApplication<WeatherServiceApplication>(*args)
}


// class Controller {
// 	@GetMapping("/")
// 	fun name(name: String) : Test {
// 	}
// }
// ]
// data class Test(val name: String) 
// }