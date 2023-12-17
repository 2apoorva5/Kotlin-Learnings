package functions

/** if you don't want the function to return anything, you can use 'Unit'
 *  similar to 'void' in Java
 *  the function will return kotlin.Unit in this case
 */

fun total(vararg numbers: Int): Unit {
    var total = 0
    for (number in numbers) {
        total += number
    }
}

fun main(args: Array<String>) {
    println(total(12, 23, 34, 45, 56, 67, 78, 89))
}