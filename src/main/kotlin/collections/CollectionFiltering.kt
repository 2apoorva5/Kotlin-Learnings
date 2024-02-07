package collections

/** We can {filter} a collection based on some condition, and it will return a collection satisfying that condition.
 *
 *  We can have different variations of {filter} on a collection:
 *
 *  1. filter { } - returns a collection of elements satisfying the condition
 *  2. filterNot { } - returns a collection of elements not satisfying the condition
 *  3. filterIndexed { index, element -> } - returns a collection of elements with index satisfying the condition
 *
 *  We can also have {partition} over a collection based on condition. Doing a {partition} over collection returns two
 *  collections - one with elements that satisfies the condition, one with elements that doesn't satisfy the condition
 *  We can access those two collections from a {partition} as {first} and {second}, as it will be a {Pair} object.
 *
 *  any { } - returns true or false after checking if "any" item in the collection satisfies the condition
 *  none { } - returns true or false after checking if "none" of the item in the collection satisfies the condition
 *  all { } - returns true or false after checking if "all" items in the collection satisfy the condition
 */

fun main() {
    val people = listOf<Person>(
        Person("Apoorva", "Ranjan", 26, "India"),
        Person("Atul", "Ranjan", 23, "India"),
        Person("John", "Doe", 32, "America"),
        Person("Anees", "Muhammad", 48, "Pakistan"),
        Person("Pat", "Cummins", 35, "Australia"),
        Person("John", "Krasinski", 17, "England")
    )

    val citiesWithCountries = mapOf<String, String>(
        "Bangalore" to "India",
        "Chennai" to "India",
        "Washington" to "America",
        "Lahore" to "Pakistan",
        "Sydney" to "Australia",
        "London" to "England"
    )

    // filter { } on list and map

    people.filter { it.nationality == "India" }.forEach { println(it) }
    citiesWithCountries.filter { entry -> entry.value == "India" }.forEach { (t, u) -> println("$t -> $u") }

    // filterNot { }

    people.filterNot { it.age > 18 }.forEach { println(it) }

    // filterIndexed { }

    people.filterIndexed { index, person -> index % 2 == 0 && person.age > 18 }.forEach { println(it) }

    // partition { }

    people.partition { it.age > 18 }.first.forEach { println(it) }
    people.partition { it.age > 18 }.second.forEach { println(it) }

    // any { }

    println("Is there anyone from India? -> ${people.any { it.nationality == "India" }}")
    println("Is there anyone from Kenya? -> ${people.any { it.nationality == "Kenya" }}")

    // none { }

    println("Is there no one from India? -> ${people.none { it.nationality == "India" }}")
    println("Is there no one from Kenya? -> ${people.none { it.nationality == "Kenya" }}")

    // all { }

    println("Is every one above 18 YO? -> ${people.all { it.age > 18 }}")
}