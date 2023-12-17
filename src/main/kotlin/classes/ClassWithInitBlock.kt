package classes

class Person3(name: String) {                 // class with init block

    var firstName: String

    /** init block will always run when instantiating a class object
     *  any initialization can be or should be done inside init block
     */

    init {
        firstName = name
    }
}

fun main(args: Array<String>) {
    var person3 = Person3("Apoorva")
    println(person3.firstName)
}