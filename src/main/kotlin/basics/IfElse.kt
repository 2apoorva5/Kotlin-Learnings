package basics

fun main(args: Array<String>) {

    /** if-else *******************************************************************************************************/

    val num1 = 50
    val num2 = 35

    var maxNum: Int?

    if (num1 > num2) {
        maxNum = num1
    } else {
        maxNum = num2
    }

    println("Maximum number is ${maxNum}")


    /** if-elseif-else ************************************************************************************************/

    if (num1 > num2) {
        println("Maximum number is ${num1}")
    } else if (num2 > num1) {
        println("Maximum number is ${num2}")
    } else {
        println("Both numbers are equal.")
    }


    /** if-else as return statement ***********************************************************************************/
    /** while using if-else as return statement, make sure to always include else part ********************************/

    maxNum = if (num1 > num2) num1 else num2           // correct
    // maxNum = if (num1 > num2) num1                  // incorrect

    println("Maximum number is ${maxNum}")
}