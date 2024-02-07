package collections

/** map { } is a type of transformation operation on collections.
 *  It results in a different collection using some transformation rule applied over the original collection.
 *  It does not change or modify the original collection.
 *  It can be applied over {List}, {Set} or {Map} as well.
 *
 *  map { } - results in a different collection using some transformation rule applied over the original collection
 *  mapIndexed { } - same as map just with index as well
 *  mapNotNull { } - results in a different collection ignoring the nulls that may occur due to the transformation rules
 *  mapNotNullIndexed { } - same as mapNotNull just with index as well
 *  mapKeys { } or mapValues { } can be applied over {Map} collections
 */

fun main() {
    val people = listOf<Person>(
        Person("Apoorva", "Ranjan", 26, "India"),
        Person("Atul", "Ranjan", 23, "India"),
        Person("John", "Doe", 32, "America"),
        Person("Anees", "Muhammad", 48, "Pakistan"),
        Person("Pat", "Cummins", 35, "Australia")
    )

    val citiesWithCountries = mapOf<String, String>(
        "Bangalore" to "India",
        "Chennai" to "India",
        "Washington" to "America",
        "Lahore" to "Pakistan",
        "Sydney" to "Australia"
    )

    // map { }
    val firstNames = people.map { it.firstName }
    println(firstNames)

    val nationalities = people.map { it.nationality }
    println(nationalities)

    val names = people.map { "${it.firstName} ${it.lastName}" }
    println(names)


    // mapIndexed { }
    val namesWithIndex = people.mapIndexed { index, person -> "$index -> ${person.firstName} ${person.lastName}" }
    println(namesWithIndex)


    // mapNotNull { }
    val namesWithCondition = people.mapNotNull {
        if (it.nationality != "India") "${it.firstName} ${it.lastName}" else null
    }
    println(namesWithCondition)


    // mapIndexedNotNull { }
    val namesWithConditionAndIndex = people.mapIndexedNotNull { index, person ->
        if (person.nationality != "India") "$index -> ${person.firstName} ${person.lastName}" else null
    }
    println(namesWithConditionAndIndex)


    // map { } over Map
    val cities = citiesWithCountries.map { it.key }
    println(cities)

    val countries = citiesWithCountries.map { it.value }
    println(countries)


    // mapKeys { } and mapValues { } over Map
    println(citiesWithCountries.mapKeys { it.key.uppercase() })
    println(citiesWithCountries.mapValues { it.value.uppercase() })
}