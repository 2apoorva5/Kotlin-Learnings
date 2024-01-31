package collections

/** associate { } is a type of transformation operation on collections.
 *  It basically associates something to each item in a collection by an association rule defined
 *  and returns a different collection.
 *
 *  flatten() is a type of transformation operation on collections.
 *  It basically joins or combines the content of multiple collections into one single collection.
 *
 *  joinToString() is a type of transformation operation on collections.
 *  It basically allows you to create a custom way to represent a collection as a string.
 */

fun main() {
    val people = listOf<Person>(
        Person("Apoorva", "Ranjan", 26, "India"),
        Person("Atul", "Ranjan", 23, "India"),
        Person("John", "Doe", 32, "America"),
        Person("Anees", "Muhammad", 48, "Pakistan"),
        Person("Pat", "Cummins", 35, "Australia")
    )

    val cities = listOf<String>(
        "Bangalore",
        "Delhi",
        "New York",
        "Lahore",
        "Sydney"
    )

    // associate { }
    val associatedPeople1 = people.associate { Pair(it.firstName + it.lastName + it.age, it) }
    associatedPeople1.forEach { (first, second) -> println("$first -> $second") }


    // associateBy { } - simpler version of associate { }
    val associatedPeople2 = people.associateBy { it.firstName + it.lastName + it.age }
    associatedPeople2.forEach { (first, second) -> println("$first -> $second") }


    // flatten()
    val listOfNames1 = listOf<String>("Apoorva", "Atul", "Sachin")
    val listOfNames2 = listOf<String>("Vikrant", "Nikhil", "Manoj")
    val listOfNames3 = listOf<String>("Shikhar", "Rohit", "Virat")

    val listOfLists = listOf<List<String>>(listOfNames1, listOfNames2, listOfNames3)
    println(listOfLists)                         // prints a list of lists
    println(listOfLists.flatten())               // prints a list after joining the contents of all lists


    // joinToString() - string representation of list with "," as default separator
    println(cities.joinToString())

    // joinToString() - string representation of list with " | " as separator
    println(cities.joinToString(separator = " | "))

    // joinToString() - string representation of list with " | " as separator, also with prefix and postfix strings
    println(cities.joinToString(separator = " | ", prefix = "Starts Here -- ", postfix = " -- Ends Here"))
}