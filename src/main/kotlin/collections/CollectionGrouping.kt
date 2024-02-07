package collections

/** groupBy { }
 *  - returns a map with key as the condition outcomes and value as a collection of elements satisfying the condition
 *  - we can apply transformations over groupBy { }
 *
 *  groupingBy { }
 *  - returns a Grouping object
 *  - we can use different methods over groupingBy { } like eachCount()
 *
 *  fold(initial accumulator) { }
 *  - does some operation over the whole list initiating with the accumulator provided
 *
 *  reduce { }
 *  - does some operation over the whole list - doesn't need any accumulator to start
 *
 *  aggregators - sum(), average(), min(), max(), count()
 */

fun main() {
    val people = listOf<Person>(
        Person("Apoorva", "Ranjan", 26, "India"),
        Person("Atul", "Ranjan", 23, "India"),
        Person("John", "Doe", 32, "America"),
        Person("Anees", "Muhammad", 48, "Pakistan"),
        Person("Pat", "Cummins", 35, "America"),
        Person("John", "Krasinski", 17, "America")
    )

    // groupBy { }

    println(people.groupBy { it.nationality })
    println(people.groupBy { it.age > 18 })

    people.groupBy { it.nationality }.forEach { (key, value) -> println("$key -> $value") }
    people.groupBy { it.age > 18 }.forEach { (key, value) -> println("$key -> $value") }


    // transformations with groupBy { }

    people.groupBy(
        keySelector = { if (it.age > 18) "Adult" else "Minor" },
        valueTransform = { it }
    ).forEach { (key, value) -> println("$key -> $value") }


    // groupingBy { } - eachCount()

    println(people.groupingBy { it.nationality }.eachCount())
    println(people.groupingBy { it.age > 18 }.eachCount())


    val numbers = listOf(12, 32, 21, 647, 24, 83, 37, 464, 58, 25)

    // fold(initial) { }

    println("Sum of all numbers is ${numbers.fold(initial = 0) { accumulator, element -> accumulator + element }}")
    println("Product of all numbers is ${numbers.fold(initial = 1) { accumulator, element -> accumulator * element }}")

    // reduce { }

    println("Sum of all numbers is ${numbers.reduce { accumulator, element -> accumulator + element }}")
    println("Product of all numbers is ${numbers.reduce { accumulator, element -> accumulator * element }}")

    // aggregators

    println("Sum of all numbers is ${numbers.sum()}")
    println("Average of all numbers is ${numbers.average()}")
    println("Minimum of all numbers is ${numbers.min()}")
    println("Minimum of all numbers is ${numbers.minOrNull()}")
    println("Maximum of all numbers is ${numbers.max()}")
    println("Maximum of all numbers is ${numbers.maxOrNull()}")
    println("Total count of numbers is ${numbers.count()}")
    println("Total count of numbers is ${numbers.size}")
}