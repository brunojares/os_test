package teste.orangestack.model

import io.micronaut.core.annotation.Introspected
import javax.persistence.*

@Entity
@Introspected
data class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    @Column
    val name: String,
)
