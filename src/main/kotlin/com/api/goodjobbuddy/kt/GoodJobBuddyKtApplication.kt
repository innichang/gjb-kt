package com.api.goodjobbuddy.kt

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class GoodJobBuddyKtApplication

fun main(args: Array<String>) {
	runApplication<GoodJobBuddyKtApplication>(*args)
}
