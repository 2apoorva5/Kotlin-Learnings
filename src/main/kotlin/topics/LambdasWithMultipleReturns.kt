package topics

/** 1. There is no last return statements in lambdas.
 *  2. The return type of the last statement in lambda should match the return type of lambda.
 *
 *
 *  If we want to have multiple returns in a lambda based on some conditions, we can do so with {return@description}.
 */

fun main() {
    val ageDescription: (Int) -> String = description@{ age: Int ->
        if (age < 13) return@description "Child"
        else if (age in 13..19) return@description "Teenager"
        else if (age in 20..60) return@description "Adult"
        else return@description "Senior Citizen"
    }

    println(ageDescription(40))


    /** We can also ignore a parameter in a lambda declaration if that is not being used at all inside lambda body.
     *  We can replace such parameters in lambda declaration with an underscore (_).
     */

    // val sampleLambda: (String, String, String) -> Unit = {fName, mName, lName -> println("$fName $lName")}
    // can be simplified as below:
    val sampleLambda: (String, String, String) -> Unit = { fName, _, lName -> println("$fName $lName") }

    sampleLambda("Apoorva", "Ranjan", "Pandey")
}