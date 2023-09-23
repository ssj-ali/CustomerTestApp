package hello

import hello.cutomer.Customer
import hello.cutomer.CustomerRepository
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Application {

	private val log = LoggerFactory.getLogger(Application::class.java)

	@Bean
	fun init(repository: CustomerRepository) = CommandLineRunner {
			// save a couple of customers
			repository.save(Customer("Jack", "91065566544"))
			repository.save(Customer("Chloe", "766437453"))
			repository.save(Customer("Kim", "4336435436"))
			repository.save(Customer("David", "424348744"))
			repository.save(Customer("Michelle", "43445454553"))
	}

}

fun main() {
	runApplication<Application>()
}
