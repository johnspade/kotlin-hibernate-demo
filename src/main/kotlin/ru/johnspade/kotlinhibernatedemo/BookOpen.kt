package ru.johnspade.kotlinhibernatedemo

import org.springframework.data.jpa.repository.JpaRepository
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "book")
open class BookOpen(
		@Id
		open val id: Long,
		open val name: String,
		@OneToOne(fetch = FetchType.LAZY)
		open val author: AuthorOpen
)

interface BookOpenRepository: JpaRepository<BookOpen, Long>
