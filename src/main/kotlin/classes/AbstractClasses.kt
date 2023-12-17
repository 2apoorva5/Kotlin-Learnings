package classes

/** abstract means nothing concrete
 *  abstract classes means classes with some non-concrete or abstract functions and/or variables
 *  to make a class abstract, use 'abstract' keyword with it
 *  abstract classes are by default 'open' for inheritance - you can inherit child classes from them
 */

abstract class Occupation {
    abstract val occupationType: String                   // can have abstract variables too in KOTLIN
    abstract fun work()

    fun job() {                                           // abstract class can have normal functions too
        println("Does job")
    }
}

open class Engineer(override var occupationType: String) : Occupation() {  // have to override abstract variable as well

    override fun work() {                                 // have to override all abstract functions of abstract class
        println("${occupationType} - Engineering")
    }

}

open class Doctor(override var occupationType: String) : Occupation() {    // have to override abstract variable as well
    override fun work() {
        println("${occupationType} - Doctoring")
    }
}

class SoftwareEngineer(override var occupationType: String) : Engineer(occupationType) {
    override fun work() {
        println("${occupationType} - Software Engineering")
    }
}

class Cardiologist(override var occupationType: String) : Doctor(occupationType) {
    override fun work() {
        println("${occupationType} - Doctors cardio organs")
    }
}

fun main(args: Array<String>) {
    // var engineer: Occupation = Occupation()                     // can't initialize abstract class
    var engineer: Occupation = Engineer("Engineer")   // can initialize a child class of the abstract class
    engineer.work()

    var doctor: Occupation = Doctor("Doctor")         // can initialize a child class of the abstract class
    doctor.work()

    var softwareEngineer: Engineer = SoftwareEngineer("Software Engineer")
    softwareEngineer.work()

    var cardiologist: Doctor = Cardiologist("Cardiologist")
    cardiologist.work()
}