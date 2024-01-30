package collections

/** We have there methods to iterate over Collections, i.e., lists, sets or maps :
 *
 *  1. For loop
 *  2. ForEach loop
 *  3. Using Iterators
 */

fun main() {
    val sampleList = listOf<String>("Anil", "Deepak", "Vikrant", "Dheeraj", "Rahul")

    val sampleSet = setOf<String>("Anil", "Deepak", "Vikrant", "Dheeraj", "Rahul", "Deepak")

    val sampleMap = mapOf<String, String>(
        "Bangalore" to "Karnataka",
        "Chennai" to "Tamil Nadu",
        "Panjim" to "Goa",
        "Ranchi" to "Jharkhand",
        "Patna" to "Bihar"
    )


    // Iterating using for loop over list, set and map

    for (item in sampleList) {
        println(item)
    }

    for (item in sampleSet) {
        println(item)
    }

    for (item in sampleMap) {
        println("${item.key} -> ${item.value}")
    }

    for ((key, value) in sampleMap) {
        println("$key -> $value")
    }


    // Iterating using forEach loop over list, set and map

    sampleList.forEach { println(it) }

    sampleSet.forEach { println(it) }

    sampleMap.forEach { item -> println("${item.key} -> ${item.value}") }

    sampleMap.forEach { (key, value) -> println("$key -> $value") }


    // Iterating using iterators over list, set and map

    val sampleListIterator = sampleList.listIterator()
    while (sampleListIterator.hasNext()) {
        println(sampleListIterator.next())
    }

    val sampleSetIterator = sampleSet.iterator()
    while (sampleSetIterator.hasNext()) {
        println(sampleSetIterator.next())
    }

    val sampleMapIterator = sampleMap.iterator()
    while (sampleMapIterator.hasNext()) {
        val item = sampleMapIterator.next()
        println("${item.key} -> ${item.value}")
    }
}