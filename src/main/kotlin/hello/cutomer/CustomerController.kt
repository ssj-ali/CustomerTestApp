package hello.cutomer

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController(private val repository: CustomerRepository) {

	@GetMapping("/customers")
	fun findAll() = repository.findAll()

	@GetMapping("/customers/find/name/{name}")
	fun findByName(@PathVariable name:String)
			= repository.findByName(name)

	@GetMapping("/customers/find/mobile/{mobile}")
	fun findByMobile(@PathVariable mobile:String)
			= repository.findByMobile(mobile)

	@PostMapping("/save/name/{name}/mobile/{mobile}")
	fun save(@PathVariable name: String, @PathVariable mobile: String): String {
		repository.save(Customer(name, mobile))
		return "Done"
	}
}