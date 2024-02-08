package collections

/** There are multiple functions for collection ordering in a certain manner.
 *
 *  1. sorted() -> sorts the collection in ascending order according to the type of elements present
 *  2. sortedDescending() -> sorts the collection in descending order according to the type of elements present
 *
 *  3. sortedBy { field } -> sorts a custom object collection based on the field provided
 *
 *  4. reversed() -> reverse the collection
 *  5. asReversed() -> displays the same collection in reverse order
 *
 *  6. shuffled() -> shuffles the collection
 */

fun main() {
    val listOfCities = listOf("Chennai", "Bangalore", "Hyderabad", "Mumbai", "New Delhi", "Hubli", "Ranchi", "Panji")
    val listOfNumbers = listOf(12, 44, 56, 23, 45, 78, 34, 56, 73, 15, 8, 98, 65)

    val people = listOf<Person>(
        Person("Apoorva", "Ranjan", 26, "India"),
        Person("Atul", "Ranjan", 23, "India"),
        Person("John", "Doe", 32, "America"),
        Person("Anees", "Muhammad", 48, "Pakistan"),
        Person("Pat", "Cummins", 35, "Australia"),
        Person("John", "Krasinski", 17, "England")
    )

    // sorted

    println(listOfCities.sorted())
    println(listOfNumbers.sorted())

    // sortedDescending

    println(listOfCities.sortedDescending())
    println(listOfNumbers.sortedDescending())

    // sortedBy

    println(people.sortedBy { it.age })

    // reversed and asReversed

    println(listOfCities.reversed())
    println(listOfCities.asReversed())

    // shuffled

    println(listOfCities.shuffled())
    println(listOfNumbers.shuffled())
}