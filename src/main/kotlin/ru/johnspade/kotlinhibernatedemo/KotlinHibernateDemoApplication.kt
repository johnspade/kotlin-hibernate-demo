package ru.johnspade.kotlinhibernatedemo

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.transaction.annotation.Transactional

@SpringBootApplication
class KotlinHibernateDemoApplication(
		private val bookRepository: BookRepository,
		private val bookOpenRepository: BookOpenRepository
): CommandLineRunner {

	@Transactional
	override fun run(vararg args: String) {
		println("data class: " + bookRepository.getOne(1).name)
		println("open class: " + bookOpenRepository.getOne(1).name)
	}

}

fun main(args: Array<String>) {
	runApplication<KotlinHibernateDemoApplication>(*args)
}
