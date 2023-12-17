package functions

/** We can create an Extension Function for a class inside another class
 *  that will be termed as Extension Function for a class as Member Function for another class
 *
 *  The class for which we will create an extension function, will be termed as 'Extension Receiver'
 *  The class in which that extension function will be created, will be termed as 'Extension Dispatcher'
 */

class Radio(val frequency: String) {                        // Extension Receiver
    fun play() {
        println("Playing audio from FM : ${frequency}")
    }
}

class Car(val radio: Radio, val carName: String) {          // Extension Dispatcher
    fun printName() {
        print(carName)
    }

    fun Radio.audioDetails() {                              // Extension Function for Radio as Member Function for Car
        printName()
        print(" : ")
        radio.play()
    }

    fun showCarAudioDetails() {
        radio.audioDetails()
    }
}

fun main(args: Array<String>) {
    var radio = Radio("98.5")

    var car = Car(radio, "Tata Nexon")
    car.showCarAudioDetails()
}