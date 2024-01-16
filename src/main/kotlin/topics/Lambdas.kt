package topics

/** Lambdas are basically shorthand variation of functions which can be treated as variable as well.
 *
 *  Lambdas are also called Higher-Order Functions that basically means a function that takes functions as parameters
 *  or return a function itself.
 *
 *  Lambdas don't return anything - the last expression of the lambda is treated like it is being returned.
 */

fun add(a: Int, b: Int): Int {
    return a + b
}

/** The same above add() function can be written in a shorthand variation as well with lambda, on the fly. */

fun main() {
    val sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }       // lambda function sum() equivalent to add() function

    // val sum: (Int, Int) -> Int = {a, b -> a + b}             // other way to write lambda without mentioning arg type

    // val sum: {a: Int, b: Int -> a + b}            // other way to write lambda without parameter type and return type


    /** lambdas can be called like normal functions as well as with invoke() functions */

    println(sum(10, 15))                             // lambda function call as normal
    println(sum.invoke(10, 15))                      // lambda function call with invoke()
}