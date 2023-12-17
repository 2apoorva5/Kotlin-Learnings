package functions

class Person {
    var firstName = "Apoorva"
    var lastName = "Ranjan"


    /** normal function without parameters or return value */

    fun displayName() {
        println("${firstName} ${lastName}")
    }
}

fun main(args: Array<String>) {
    var person = Person()
    person.displayName()         // function call on class object
}