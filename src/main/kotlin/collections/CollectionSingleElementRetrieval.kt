package collections

/** Multiple functions are there for single element retrieval from a collection.
 *
 *  1. elementAt(4) -> returns element at index 4
 *  2. elementAtOrNull(10) -> returns element at index 10 or null
 *  3. elementAtOrElse(10) -> returns element at index 10 or custom something
 *
 *  4. first() -> returns first element of collection
 *  5. first { condition } -> returns first element satisfying the condition
 *
 *  6. last() -> returns last element of collection
 *  7. last { condition } -> returns last element satisfying the condition
 *
 *  8. find { condition } -> finds and returns first element satisfying the condition
 *
 *  9. random() -> returns random element from a collection
 *
 *  10. contains(element) -> returns true or false basis if collection contains that element or not
 *  11. isEmpty() -> returns true or false basis collection is empty or not
 *  12. isNotEmpty() -> returns true or false basis collection is non-empty or not
 *
 *  13. firstNotNullOf { condition } -> returns first element satisfying the condition or exception
 *  14. firstNotNullOfOrNull { condition } -> returns first element satisfying the condition or null
 */

@Suppress("KotlinConstantConditions")
fun main() {
    val listOfCities = listOf("Chennai", "Bangalore", "Hyderabad", "Mumbai", "New Delhi", "Hubli", "Ranchi", "Panji")

    // elementAt

    println(listOfCities.elementAt(4))
    println(listOfCities.elementAtOrNull(10))
    println(listOfCities.elementAtOrElse(10) { index -> "No element present at $index" })

    // first and last

    println(listOfCities.first())
    println(listOfCities.first { it.startsWith("M", true) })

    println(listOfCities.last())
    println(listOfCities.last { it.length > 6 })

    // find

    println(listOfCities.find { it.length == 5 })

    // random

    println(listOfCities.random())

    // contains

    println(listOfCities.contains("New Delhi"))
    println(listOfCities.contains("Patna"))

    // isEmpty and isNotEmpty

    println(listOfCities.isEmpty())
    println(listOfCities.isNotEmpty())

    // firstNotNullOf and firstNotNullOfOrNull

    println(listOfCities.firstNotNullOf { it.length.takeIf { it == 5 } })
    println(listOfCities.firstNotNullOfOrNull { it.length.takeIf { it > 15 } })
}