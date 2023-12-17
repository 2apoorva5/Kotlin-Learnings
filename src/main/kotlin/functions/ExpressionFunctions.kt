package functions

/** Expression Function - function returning value in a single line
 *  function expression itself as return value of the function
 */

fun isEven(number: Int): Boolean = (number % 2 == 0)

fun isMinor(age: Int): Boolean = (age < 18)

fun greaterNumber(num1: Int, num2: Int): Int = if (num1 > num2) num1 else num2

fun main(args: Array<String>) {
    println(isEven(23))
    println(isEven(68))

    println(isMinor(14))
    println(isMinor(22))

    println(greaterNumber(24, 45))
    println(greaterNumber(68, 32))
}

