package ru.johnspade.kotlinhibernatedemo

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "author")
data class Author(
		@Id
		val id: Long,
		val name: String
)
