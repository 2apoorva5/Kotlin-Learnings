package topics

/** Suppose a class expects a Long value as an argument but while instantiating, someone gives a small int value.
 *  We can not stop it but in such cases we can handle it in a way that even if someone gives an int value, we
 *  somehow convert it into a corresponding Long value using 'companion objects'
 *
 *  We can have basically two functions inside companion objects to handle the given argument in two different ways
 *
 *  This is one solution, but it's costly as it will try to create two different objects - two different hashcode()
 *
 *  We handle such things by using VALUE CLASS, which will treat same two companion objects as primitive values
 *  and not two separate objects.
 */

@JvmInline
value class TimePeriod private constructor(
    val timePeriod: Long
) {
    companion object {
        fun millis(millis: Long) = TimePeriod(millis)

        fun seconds(seconds: Long) = TimePeriod(seconds * 1000)
    }
}

fun displayTimePeriod(message: String, duration: TimePeriod) {
    println("${message} ${duration.timePeriod} milliseconds")
    println("Hashcode for the time period : ${duration.hashCode()}")
}

fun main() {
    displayTimePeriod("Displaying time period for ", TimePeriod.millis(2000))
    displayTimePeriod("Displaying time period for ", TimePeriod.seconds(2))
}