package topics

/** Since lambdas are treated as variable only in KOTLIN, they can be passed as arguments to a function.
 *  Just that we will need to define its type and return type as it is in function declaration.
 */

fun main() {
    val nationCapital1: Pair<String, String> = Pair("India", "New Delhi")
    val nationCapital2: Pair<String, String> = Pair("USA", "Washington DC")
    val nationCapital3: Pair<String, String> = Pair("Sri Lanka", "Colombo")

    val printNationCapitals: (Pair<String, String>) -> Unit =
        { pair -> println("${pair.first}'s capital is ${pair.second}") }

    val listOfNations = listOf(nationCapital1, nationCapital2, nationCapital3)

    printKeyValuePairs(listOfNations, printNationCapitals)  // function with lambda as argument


    /** We can directly pass lambda body as argument to a function as well - no need to create a lambda */

    printKeyValuePairs(listOfNations, { pair -> println("${pair.first}'s capital is ${pair.second}") })


    /** We can actually take out the lambda body passed as arguments outside the function's parentheses for readability.
     *  This is called 'Trailing Lambda Syntax'.
     */

    printKeyValuePairs(listOfNations) { pair -> println("${pair.first}'s capital is ${pair.second}") }
}


// function with lambda as argument
fun printKeyValuePairs(keyValuePairList: List<Pair<String, String>>, lambda: (Pair<String, String>) -> Unit): Unit {
    keyValuePairList.forEach(lambda)
    println()
}