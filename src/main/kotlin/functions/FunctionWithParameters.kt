package functions

class Employee {
    lateinit var firstName: String
    lateinit var lastName: String


    /** function with normal parameters */

    fun displayName(name: String, surname: String) {        // function parameters are of val type - can't be reassigned

        firstName = name
        lastName = surname

        println("${firstName} ${lastName}")
    }


    /** function with default parameter */

    fun displayJobTitle(title: String = "Android Developer", techStack: String) {     // title param has a default value
        println("${title} - ${techStack}")
    }
}

fun main(args: Array<String>) {
    var employee = Employee()

    employee.displayName("Apoorva", "Ranjan")  // function call with parameters on class object
    employee.displayJobTitle(techStack = "Android")          // call for function with default params using named params
}