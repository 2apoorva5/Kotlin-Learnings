package collections

/** Plus/Minus on collection basically adds or removes single element or whole collection to or from
 *  other collection.
 */

fun main() {
    val listOfNames1 = listOf<String>("Apoorva", "Atul", "Sachin")
    val listOfNames2 = listOf<String>("Vikrant", "Nikhil", "Manoj")
    val listOfNames3 = listOf<String>("Shikhar", "Rohit", "Virat", "Nikhil")

    // plus

    println(listOfNames1 + "Parixit")               // add single element to collection
    println(listOfNames1 + listOfNames2)            // add other collection to collection

    // minus

    println(listOfNames3 - "Virat")                 // remove single element from collection
    println(listOfNames3 - listOfNames2)            // remove elements of other collection from collection
}