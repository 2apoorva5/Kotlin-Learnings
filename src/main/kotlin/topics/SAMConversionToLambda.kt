package topics

/** An interface with a single abstract function is called Function Interface, and it is also known as
 *  SAM - Single Access Method
 *
 *  'SAM Conversion to Lambda' basically means to convert the function interface to act as a Lambda.
 */

/** NOTE : For an interface to be a function interface, it has to be marked as 'fun interface' and only
 *  then it can be used in SAM Conversion to Lambda.
 */

class Man(val name: String, val age: Int)

fun interface AgeDescriber {                                         // Function Interface or SAM (Single Access Method)
    fun ageDescription(man: Man)
}

fun ageDescriptor(men: List<Man>, ageDescriber: AgeDescriber) {
    men.forEach { ageDescriber.ageDescription(it) }
}

fun main() {
    val men = listOf(
        Man("Apoorva", 25),
        Man("Atul", 22),
        Man("Sachin", 24)
    )

    ageDescriptor(men, object : AgeDescriber {
        override fun ageDescription(man: Man) {
            val ageDescriber = if (man.age < 13) "Child"
            else if (man.age in 13..19) "Teenager"
            else if (man.age in 20..60) "Adult"
            else "Senior Citizen"

            println("${man.name} is a $ageDescriber as his age is ${man.age}")
        }
    })

    /** the above function call can be done in other way by converting the function interface (SAM) as a lambda */

    ageDescriptor(men) { man ->                         // SAM converted to Lambda
        val ageDescriber = if (man.age < 13) "Child"
        else if (man.age in 13..19) "Teenager"
        else if (man.age in 20..60) "Adult"
        else "Senior Citizen"

        println("${man.name} is a $ageDescriber as his age is ${man.age}")
    }
}