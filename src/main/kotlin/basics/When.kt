package basics

fun main(args: Array<String>) {

    /** when **********************************************************************************************************/

    val planetPosition = 3

    var message: String?

    when (planetPosition) {
        0 -> message = "You must be joking"
        1 -> message = "You are Mercury"
        2 -> message = "You are Venus"
        3 -> message = "You are Earth"
        4 -> message = "You are Mars"
        5 -> message = "You are Saturn"
        6 -> message = "You are Jupiter"
        7 -> message = "You are Uranus"
        8 -> message = "You are Neptune"
        9 -> message = "You are Pluto"
        else -> message = "You are unknown"
    }

    println(message)


    /** when as return statement **************************************************************************************/

    message = when (planetPosition) {
        0 -> "You must be joking"
        1 -> "You are Mercury"
        2 -> "You are Venus"
        3 -> "You are Earth"
        4 -> "You are Mars"
        5 -> "You are Saturn"
        6 -> "You are Jupiter"
        7 -> "You are Uranus"
        8 -> "You are Neptune"
        9 -> "You are Pluto"
        else -> "You are unknown"
    }

    println(message)


    /** combine options ***********************************************************************************************/

    message = when (planetPosition) {
        0 -> "You must be joking"
        1, 2, 3, 4 -> "You are in inside circle of Solar System"
        5, 6, 7, 8 -> "You are in outside circle of Solar System"
        9 -> "You are Pluto"
        else -> "You are unknown"
    }

    println(message)


    /** combine options with range (in ..) operator *******************************************************************/

    message = when (planetPosition) {
        0 -> "You must be joking"
        in 1..4 -> "You are in inside circle of Solar System"
        in 5..8 -> "You are in outside circle of Solar System"
        9 -> "You are Pluto"
        else -> "You are unknown"
    }

    println(message)


    /** boolean expression as options in when *************************************************************************/

    val num1 = 50
    val num2 = 35

    var maxNum: String? = when {
        (num1 > num2) -> "num1 is greater"
        (num2 > num1) -> "num2 is greater"
        else -> "both num1 and num2 are equal"
    }

    println(maxNum)


    /** when as type checker ******************************************************************************************/

    val sampleNum: Any = 10.12

    var numType: String? = when (sampleNum) {
        is Float -> "sampleNum is Float"
        is Double -> "sampleNum is Double"
        is Int -> "sampleNum is Int"
        is Long -> "sampleNum is Long"
        else -> "Unknown datatype"
    }

    println(numType)
}