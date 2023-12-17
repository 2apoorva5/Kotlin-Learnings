package classes

class Person5 {
    var firstName: String

    constructor(name: String) {          // secondary constructor can also be used to instantiate class objects
        firstName = name
    }
}

fun main(args: Array<String>) {
    var person5 = Person5("Apoorva")
    println(person5.firstName)
}