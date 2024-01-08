package topics

/** You don't always want to create a child class from a parent class if that is going to be used only once.
 *  In this case, you can basically create an object and extend it from that parent class on the fly with
 *  something called 'Object Expressions'
 */

open class Vehicle {
    open fun runsOn() {
        println("Runs on fuel")
    }
}

/** Now you can create a child class here for the Vehicle class and later create an instance of that to use */

fun main() {
    /** But instead, you can do something like this with object expressions --> */

    val electricVehicle = object : Vehicle() {    // extending from Vehicle class on the fly
        override fun runsOn() {
            println("Runs on electricity")
        }
    }

    electricVehicle.runsOn()
}


/** Points to note for object expressions :
 *
 *  1. We can extend an abstract class as well with object expressions
 *  2. We can implement an interface as well with object expressions
 *  3. We can extend a class and simultaneously implement interfaces as well with object expressions
 *  4. We will have to implement all undefined functions and undeclared variable of an abstract class
 *     or an interface in such cases
 *  5. We can provide an object its own method as well apart from the ones extended from parent class
 */