package hello.cutomer

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Customer(
		var name: String,
		var mobile: String,

		@Id @GeneratedValue
		var id: Long = -1
)
