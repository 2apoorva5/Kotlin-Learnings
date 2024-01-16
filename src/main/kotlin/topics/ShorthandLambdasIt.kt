package topics

/** Lambdas with only a single parameter do not need to define the argument and its type again.
 *  We also don't need to use the arguments inside the body of lambda again and again.
 *
 *  If there is only a single parameter in the lambda, that can be inferred with 'it' keyword.
 *  'it' will basically be the single argument and that can be used inside the body too.
 */

fun main() {
    val square: (Int) -> Int = { num: Int -> num * num }

    /** The same can be written in shorthand with 'it' */

    val squared: (Int) -> Int =
        { it * it }                     // it being the single argument - basically working as num

    /** NOTE: 'it' can only be used if the lambda has a single parameter */

    println(square(12))
    println(squared(12))
}