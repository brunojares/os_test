package teste.orangestack.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import teste.orangestack.model.Person
import teste.orangestack.service.PersonService

@Controller("/api/v1/person")
class PersonController(
    private val personService: PersonService
) {
    @Get("/")
    fun get(): List<Person> {
        return personService.findAll()
    }

    @Post
    fun post(person: Person): Person {
        return personService.save(person);
    }
}