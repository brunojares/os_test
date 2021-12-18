package teste.orangestack.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lteste/orangestack/controller/PersonController;", "", "personService", "Lteste/orangestack/service/PersonService;", "(Lteste/orangestack/service/PersonService;)V", "get", "", "Lteste/orangestack/model/Person;", "post", "person", "agenda"})
@io.micronaut.http.annotation.Controller(value = "/api/v1/person")
public final class PersonController {
    private final teste.orangestack.service.PersonService personService = null;
    
    public PersonController(@org.jetbrains.annotations.NotNull
    teste.orangestack.service.PersonService personService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Get(value = "/")
    public final java.util.List<teste.orangestack.model.Person> get() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Post
    public final teste.orangestack.model.Person post(@org.jetbrains.annotations.NotNull
    teste.orangestack.model.Person person) {
        return null;
    }
}