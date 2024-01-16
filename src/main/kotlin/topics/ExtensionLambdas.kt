package topics

/** We can write Extension functions for a class if that class doesn't already have such a function for a task.
 *
 *  Now, instead of writing a full-fledged Extension function everytime in need, we can write Lambda Extension
 *  on the fly whenever we need it.
 */

fun String.abbreviate(): String {
    val splitStrings = this.split(" ", " ", ignoreCase = true)

    var abbreviation: StringBuilder? = StringBuilder("")

    for (word in splitStrings) {
        abbreviation?.append(word[0])
    }

    return abbreviation.toString().uppercase()
}

/** Now, above String Extension Function - abbreviate() could have been written as a Lambda too on the fly */

fun main() {
    // Lambda Extension lambdaAbbreviate for String class - same as String.abbreviate() extension defined above

    val lambdaAbbreviate: String.() -> String = {
        val splitStrings = this.split(" ", " ", ignoreCase = true)

        var abbreviation: StringBuilder? = StringBuilder("")

        for (word in splitStrings) {
            abbreviation?.append(word[0])
        }

        abbreviation.toString().uppercase()
        // notice that the lambda doesn't return anything - this above last expression will itself be returned
    }


    val name = "Virendra Kumar Pandey"

    println(name.abbreviate())
    println(name.lambdaAbbreviate())
}