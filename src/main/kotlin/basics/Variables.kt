package basics

fun main(args: Array<String>) {

    /** Variable initialization ***************************************************************************************/

    // var/val variableName: <DataType> = Literal


    /** Type Inference ************************************************************************************************/

    var number1 = 10
    // var number1: Int = 10                // Don't have to mention type - Type Inference

    var number2 = 10.0F
    // var number2: Float = 10.0F           // Don't have to mention type - Type Inference


    /** String Interpolation ******************************************************************************************/

    print("Number1 is ${number1} and Number2 is ${number2}")


    /** var and val ***************************************************************************************************/

    number2 = 10.5F                         // number2 can be reassigned as it is declared as var (mutable)

    val number3 = 12.12
    // number3 = 12.5                       // Error - number3 can't be reassigned as it is declared as val (immutable)


    /** Type Casting - toDouble(), toFloat(), toInt(), etc. ***********************************************************/

    val number4: Double = number2.toDouble()      // toDouble() or similar methods can be used too for Type Casting
    val number5: Float = number3.toFloat()        // toFloat() or similar methods can be used too for Type Casting
    val number6: Int = "345".toInt()              // toInt() here is used to convert the String integer to Int
}