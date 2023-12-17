package functions

/** using vararg keyword, we can pass multiple arguments for a single parameter
 *  a function can have only one vararg parameter
 */

fun sum(vararg numbers: Int): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }

    return sum
}


/** we can have normal parameters also along with vararg parameter
 *  the vararg parameter can be the first parameter or the last parameter in such cases
 *  if vararg parameter is the first parameter, to pass arguments to other parameters, we have to use named args concept
 */

fun totalMarks(vararg marks: Int, name: String): String {
    var totalMarks = 0
    for (mark in marks) {
        totalMarks += mark
    }

    return "${name} has obtained ${totalMarks} marks."
}

fun main(args: Array<String>) {
    println(sum(12, 23, 34, 45, 56, 67, 78, 89))

    println(totalMarks(98, 89, 92, 93, 78, name = "Apoorva Ranjan"))    // use named argument for other parameter
}

