package functions

class Student {

    lateinit var firstName: String
    lateinit var lastName: String

    var age: Int? = null


    /** multiple functions with same name can co-exist in a class provided they have different signatures
     *  that means that the functions should have different no. or types of parameters
     *  functions with same no. or type of parameters but with different return values cannot co-exist
     *  functions with same signature but different return values can't be considered for function overloading
     */

    fun displayInfo(name: String, surname: String): String {

        firstName = name
        lastName = surname

        return "${firstName} ${lastName}"
    }

    fun displayInfo(age: Int): Int {
        this.age = age

        return this.age!!
    }

    /** here displayInfo function has been defined 2 times but with different parameters - function overloading */
}

fun main(args: Array<String>) {
    var student = Student()

    println("Name is ${student.displayInfo("Apoorva", "Ranjan")}")
    println("Age is ${student.displayInfo(25)}")

    /** here displayInfo function is getting called 2 times but with different list of parameters */
}