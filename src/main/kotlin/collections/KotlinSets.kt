package collections

/** {Set} is a type of Kotlin {Collection}.
 *
 *  All sets are immutable by default. To make changes to them after their creation,
 *  we have to use them as {MutableSet}
 *
 *  Set:
 *  1. non-indexed
 *  2. unordered
 *  3. can't have duplicates
 *  4. by default immutable - can't be changed (add or remove item) once created
 */

fun main() {
    // Creation of Set -> two methods -> setOf<DataType>() and buildSet<DataType> { }

    val sampleSet1 = setOf<String>("Anil", "Deepak", "Vikrant", "Dheeraj", "Rahul", "Deepak")

    val sampleSet2 = buildSet<String> {
        add("Anil")
        add("Deepak")
        add("Vikrant")
        add("Dheeraj")
        add("Rahul")
        add("Deepak")
    }

    println(sampleSet1)
    println(sampleSet2)


    // Creation of MutableSet -> mutableSetOf<DataType>()

    val sampleMutableSet = mutableSetOf<String>("Anil", "Deepak", "Vikrant", "Dheeraj", "Rahul", "Deepak")
    sampleMutableSet.add("Nikhil")
    sampleMutableSet.remove("Vikrant")

    println(sampleMutableSet)
}