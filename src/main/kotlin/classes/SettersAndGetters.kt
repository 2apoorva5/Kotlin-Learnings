package classes

class Employee {

    /** setters and getters - those are provided by default for every instance variable in a class
     *  both setters and getters can be directly accessed through {object.variableName} itself
     *  you can however write your own customised definition for setter and getter for a particular instance variable
     *  use set(value) function for setters and get() function for getters
     */

    var firstName: String? = null
        set(value) {
            field = value?.uppercase()
        }
        get() = field

    var lastName: String? = null
        set(value) {
            field = value?.lowercase()
        }
        get() = field
}

fun main(args: Array<String>) {
    var employee = Employee()
    employee.firstName = "Sachin"
    employee.lastName = "Singla"
    println("${employee.firstName} ${employee.lastName}")
}