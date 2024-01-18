package topics

/** Object de-structuring can be done with lambdas as well */

fun main() {
    val nationCapital1: Pair<String, String> = Pair("India", "New Delhi")
    val nationCapital2: Pair<String, String> = Pair("USA", "Washington DC")
    val nationCapital3: Pair<String, String> = Pair("Sri Lanka", "Colombo")

    val printNationCapitals: (Pair<String, String>) -> Unit =
        { pair -> println("${pair.first}'s capital is ${pair.second}") }

    val listOfNations = listOf(nationCapital1, nationCapital2, nationCapital3)

    listOfNations.forEach(printNationCapitals)
}