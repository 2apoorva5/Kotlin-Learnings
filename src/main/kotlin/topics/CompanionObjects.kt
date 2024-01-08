package topics

/** KOTLIN doesn't have concept of static variables or functions like in JAVA
 *  For that purpose, it has something called 'Companion Objects'
 *
 *  Companion objects are basically objects defined inside a class to be always associated with that
 *  particular class only.
 *  Any function defined or variable declared inside a companion object of a class can be directly accessed
 *  by that class without any object instance - similar like 'static' in JAVA
 *
 *  Companion objects can be used to create Singleton objects
 */

class Employee {
    companion object {
        val firstName = "Apoorva"     // can be directly accessed without any object instance for the Employee class
        val lastName = "Ranjan"       // can be directly accessed without any object instance for the Employee class

        fun job(): String {           // can be directly accessed without any object instance for the Employee class
            return "Software Engineer"
        }
    }
}

fun main() {
    /** variables and function defined inside companion object for Employee class are directly accessible */

    println("${Employee.firstName} ${Employee.lastName} is a ${Employee.job()}")
}