package basics

fun main(args: Array<String>) {

    /** for loop with range (in ..) operator **************************************************************************/

    for (i in 1..10) {
        print("$i \t")
    }

    println()


    /** for loop with rangeTo() operator ******************************************************************************/

    for (i in 1.rangeTo(10)) {
        print("$i \t")
    }

    println()


    /** for loop in reverse order (downTo) *****************************************************************************/

    for (i in 10 downTo 1) {
        print("$i \t")
    }

    println()


    /** for loop with jump or increment (step) ************************************************************************/

    for (i in 1..10 step 2) {
        print("$i \t")
    }

    println()


    /** for loop with jump or increment (step) in reverse order *******************************************************/

    for (i in 10 downTo 1 step 2) {
        print("$i \t")
    }

    println()


    /** for loop with last number in range as exclusive ***************************************************************/

    for (i in 1 until 10) {
        print("$i \t")
    }

    println()


    /** for loop with array *******************************************************************************************/

    val sampleArray = arrayOf(23, 34, 45, 56, 65, 37, 44, 67, 89, 12, 98)

    for (number in sampleArray) {
        print("$number \t")
    }
}