package ru.johnspade.kotlinhibernatedemo

import org.springframework.data.jpa.repository.JpaRepository
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "book")
data class Book(
		@Id
		val id: Long,
		val name: String,
		@OneToOne(fetch = FetchType.LAZY)
		val author: Author
)

interface BookRepository: JpaRepository<Book, Long>
