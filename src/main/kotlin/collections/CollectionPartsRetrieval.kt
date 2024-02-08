package collections

/** We have multiple functions to retrieve parts of collection according to some conditions
 *
 *  1. slice(0..5) -> returns elements between 0 and 5
 *  2. slice(0..6 step 2) -> returns elements between 0 and 5 stepping by 2, means skipping 1 element in between
 *  3. slice(setOf(2, 3, 5, 7) -> returns elements present at given set of indices
 *
 *  4. take(4) -> takes first 4 elements
 *  5. drop(4) -> drops first 4 elements
 *  6. takeWhile { condition } -> takes elements from starting while condition meets
 *  7. dropWhile { condition } -> drops elements from starting while condition meets
 *
 *  8. takeLast(4) -> takes last 4 elements
 *  9. dropLast(4) -> drops last 4 elements
 *  10. takeLastWhile { condition } -> takes elements from last while condition meets
 *  11. dropLastWhile { condition } -> drops elements from last while condition meets
 *
 *  12. chunked(3) -> creates collection of collections with maximum 3 elements
 *  13. windowed(3, 2, false) -> creates collection of collections with at least 3 elements
 *                               with each next collection starting at the element from previous collection
 *                               after skipping the first 2 elements
 */

fun main() {
    val listOfCities = listOf("Chennai", "Bangalore", "Hyderabad", "Mumbai", "New Delhi", "Hubli", "Ranchi", "Panji")

    // slice

    println(listOfCities.slice(0..5))
    println(listOfCities.slice(0..6 step 2))
    println(listOfCities.slice(setOf(2, 3, 5, 7)))

    // take and drop

    println(listOfCities.take(4))
    println(listOfCities.drop(4))

    // takeWhile and dropWhile

    println(listOfCities.takeWhile { it.length > 5 })
    println(listOfCities.dropWhile { it.length > 5 })

    // takeLast and dropLast

    println(listOfCities.takeLast(4))
    println(listOfCities.dropLast(4))

    // takeLastWhile and dropLastWhile

    println(listOfCities.takeLastWhile { it.length <= 6 })
    println(listOfCities.dropLastWhile { it.length <= 6 })

    // chunked

    println(listOfCities.chunked(3))

    // windowed

    println(listOfCities.windowed(3, 2, false))
}