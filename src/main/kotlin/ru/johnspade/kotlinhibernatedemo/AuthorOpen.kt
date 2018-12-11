package ru.johnspade.kotlinhibernatedemo

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "author")
open class AuthorOpen(
		@Id
		open val id: Long,
		open val name: String
)
