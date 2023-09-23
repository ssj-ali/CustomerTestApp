package hello.cutomer

import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Long> {

	fun findByMobile(mobile: String): Iterable<Customer>

	fun findByName(name: String): Iterable<Customer>
}
