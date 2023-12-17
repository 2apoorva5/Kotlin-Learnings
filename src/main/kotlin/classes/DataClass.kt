package classes

/** A class can basically hold data for you
 *  But, it won't have the hashcode(), toString(), etc. functions implemented by default for its variables
 *  A data class basically derives these functions by default for all of its variables
 *  You can make a class as data class by appending 'data' keyword against it
 */

/** The compiler automatically derives the following members from all properties declared in the primary
 *  constructor of data class :
 *  1. equals() / hashcode() pair
 *  2. toString() of the form User(name=Apoorva, age=25)
 *  3. componentN() functions corresponding to each property in their order of declaration
 *  4. copy() function
 */

/** Classes need to fulfill the following requirements for them to be considered as data classes :
 *  1. the primary constructor needs to have at least one parameter
 *  2. all primary constructor parameters need to be marked val or var
 *  3. data classes cannot be abstract, open, sealed or inner
 */

data class User(val firstName: String, val lastName: String, val age: Int)

/** If you don't want some property to be included in the default implementation of hashcode(), toString(), etc.
 *  functions, you can do that by declaring such properties in the class body rather than the primary constructor.
 */

data class Person(val firstName: String, val lastName: String, val age: Int) {
    lateinit var gender: String                       // toString() or hashcode() will not be generated for gender
}

fun main(args: Array<String>) {
    val user = User("Apoorva", "Ranjan", 25)
    println(user)                            // directly prints toString() values for data class User

    val person = Person("Sachin", "Singla", 24)
    person.gender = "Male"
    println(person)                          // directly prints toString() values for data class Person

    val copyPerson = person.copy()           // copy() function can directly be used to create another Person instance
    println(copyPerson)

    val secondPerson = person.copy(age = 28) // you can change value for any property in the instance created by copy()
    println(secondPerson)


    /** Object Destructing with copy() function */

    val (fname, lname, year) = secondPerson   // fname, lname, year are local variables in this case
    println("$fname $lname $year")
}