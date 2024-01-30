package collections

/** {Map} is not a {Collection}. It is a different entity altogether. It is basically a {key, value} pair type.
 *
 *  All maps are immutable by default. To make changes to them after their creation,
 *  we have to use them as {MutableMap}
 *
 *  Map:
 *  1. key, value pair
 *  2. can't have duplicate keys
 *  3. by default immutable - can't be changed (add or remove item) once created
 */

fun main() {
    // Creation of Map -> two methods -> mapOf<DataType, DataType>() and buildMap<DataType, DataType> { }

    val sampleMap1 = mapOf<String, String>(
        "Bangalore" to "Karnataka",
        "Chennai" to "Tamil Nadu",
        "Panjim" to "Goa"
    )

    val sampleMap2 = buildMap<String, String> {
        put("Bangalore", "Karnataka")
        put("Chennai", "Tamil Nadu")
        put("Panjim", "Goa")
    }

    println(sampleMap1)
    println(sampleMap2)


    // Creation of MutableMap -> mutableMapOf<DataType, DataType>()

    val sampleMutableMap = mutableMapOf<String, String>(
        "Bangalore" to "Karnataka",
        "Chennai" to "Tamil Nadu",
        "Panjim" to "Goa"
    )
    sampleMutableMap["Patna"] = "Bihar"
    sampleMutableMap["Ranchi"] = "Jharkhand"

    println(sampleMutableMap)
}