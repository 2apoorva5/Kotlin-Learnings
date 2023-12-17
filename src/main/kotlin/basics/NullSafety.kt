package basics

fun main(args: Array<String>) {

    /** use ? to make a variable as nullable type *********************************************************************/

    var sampleNumber: Int? = 10                      // use ? with the type to make it as nullable type
    sampleNumber = null                              // nullable variables can be assigned as null
    println("Number is ${sampleNumber}")


    /** use ? (safe operator) with method call on nullable variables **************************************************/

    var sampleString1: String? = null                // use ? with the type to make it as nullable type
    var sampleString2: String? = "abcdefgh"
    val stringLength1 = sampleString1?.length        // use ? (safe operator) on nullable variables while method calling
    val stringLength2 = sampleString2?.length
    println("The sampleString1 length is ${stringLength1}")
    println("The sampleString2 length is ${stringLength2}")


    /** use !! (non-null assertion operator) with method call on nullable variables only if you're sure it's not null */

    var sampleString3: String? = null           // sampleString3 is nullable variable assigned as null
    val stringLength3 = sampleString3!!.length  // calling length method with !! will throw NPE as sampleString3 is null
    println("The sampleString3 length is ${stringLength3}")


    /** use ?: (Elvis operator) for alternate to null values **********************************************************/

    var sampleString4: String? = null
    val stringLength4 = sampleString4?.length ?: "Unknown Length" // use LHS of ?: in case it is not-null, otherwise RHS
    println("The sampleString4 length is ${stringLength4}")       // output will be 'Unknown Length'
}