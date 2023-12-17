package classes

class Person2(name: String) {                 // parametrised class
    var firstName: String = name
}

fun main(args: Array<String>) {
    var person2 = Person2("Apoorva")
    println(person2.firstName)
}