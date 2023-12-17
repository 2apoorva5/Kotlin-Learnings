package functions

class Customer {

    lateinit var firstName: String
    lateinit var lastName: String


    /** function with parameters and return value */

    fun displayName(name: String, surname: String): String {                 // here the function returns a String value

        firstName = name
        lastName = surname

        return "${firstName} ${lastName}"
    }

    fun displayAge(age: Int): Int {                                          // here the function returns an Int value
        return age
    }
}

fun main(args: Array<String>) {
    var customer = Customer()

    println("Name is ${customer.displayName("Apoorva", "Ranjan")}")
    println("Age is ${customer.displayAge(25)}")
}