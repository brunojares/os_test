package teste.orangestack

import io.micronaut.runtime.Micronaut.*

fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.orange.foundation.jvm", "teste.orangestack")
		.start()
}

