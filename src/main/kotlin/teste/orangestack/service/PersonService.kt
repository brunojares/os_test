package teste.orangestack.service

import jakarta.inject.Singleton
import teste.orangestack.model.Person
import teste.orangestack.repository.PersonRepository

@Singleton
class PersonService(
    private val personRepository: PersonRepository
)
{
    fun findAll(): List<Person>{
        return personRepository.findAll()
    }
    fun save(person: Person):Person{
         return personRepository.save(person)
    }
}