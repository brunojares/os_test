package teste.orangestack.repository

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import teste.orangestack.model.Person

@Repository
interface PersonRepository: JpaRepository<Person, Long> {
}