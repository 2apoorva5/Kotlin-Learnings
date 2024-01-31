package collections

/** zip() is a type of transformation operation on collections.
 *  It is used to zip or combine teo collections of same length and type by their indices.
 *  It associates or combines the items in the two collections index wise.
 *
 *  zip() - it zips or combines two collections
 *  unzip() - it unzips any zipped collection
 *  unzip().first - returns the first collection after unzipping any zipped collection
 *  unzip().second - returns the second collection after unzipping any zipped collection
 */

fun main() {
    val people = listOf<Person>(
        Person("Apoorva", "Ranjan", 26, "India"),
        Person("Atul", "Ranjan", 23, "India"),
        Person("John", "Doe", 32, "America"),
        Person("Anees", "Muhammad", 48, "Pakistan"),
        Person("Pat", "Cummins", 35, "Australia")
    )

    val cities = listOf<String>(
        "Bangalore",
        "Delhi",
        "New York",
        "Lahore",
        "Sydney"
    )

    // zip()
    val zippedCitiesAndPeople = cities.zip(people)
    println(zippedCitiesAndPeople)


    // unzip()
    println(zippedCitiesAndPeople.unzip())


    // unzip().first and unzip().second
    println(zippedCitiesAndPeople.unzip().first)
    println(zippedCitiesAndPeople.unzip().second)
}