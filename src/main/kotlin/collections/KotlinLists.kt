package collections

/** {List} is a type of Kotlin {Collection}.
 *
 *  All lists are immutable by default. To make changes to them after their creation,
 *  we have to use them as {MutableList}
 *
 *  List:
 *  1. indexed
 *  2. ordered in insertion order
 *  3. can have duplicates
 *  4. by default immutable - can't be changed (add or remove item) once created
 */

fun main() {
    // Creation of List -> two methods -> listOf<DataType>() and buildList<DataType> { }

    val sampleList1 = listOf<String>("Anil", "Deepak", "Vikrant", "Dheeraj", "Rahul")

    val sampleList2 = buildList<String> {
        add("Anil")
        add("Deepak")
        add("Vikrant")
        add("Dheeraj")
        add("Rahul")
    }

    println(sampleList1)
    println(sampleList2)


    // Creation of MutableList -> mutableListOf<DataType>()

    val sampleMutableList = mutableListOf<String>("Anil", "Deepak", "Vikrant", "Dheeraj", "Rahul")
    sampleMutableList.add("Nikhil")
    sampleMutableList.add(2, "Shane")
    sampleMutableList.removeAt(4)

    println(sampleMutableList)
}