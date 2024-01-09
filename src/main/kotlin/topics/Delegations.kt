package topics

/** We can call a function of any different class with its object from a function with same name in another class.
 *  This is basically called 'Delegating a function to a different object'.
 */

interface Engine {
    fun runsOn()
}

class ElectricEngine : Engine {
    override fun runsOn() {
        println("Runs on electricity")
    }
}

class TeslaEngine(val engine: Engine) {
    fun runsOn() {
        engine.runsOn()                     // runsOn() of TeslaEngine is basically delegating its call to engine object
    }
}


/** Now, if we have multiple functions to be delegated from one class to another, we would need to write
 *  the piece of code similar as above multiple times for all those functions.
 *
 *  There's however a better way to do it in KOTLIN in a single line - with 'by' keyword
 */

interface Animal {
    fun makeSound()
    fun eat()
    fun livesIn()
}

class DomesticAnimal : Animal {
    override fun makeSound() {
        println("Makes domestic animal sound")
    }

    override fun eat() {
        println("Eats grass and vegetables")
    }

    override fun livesIn() {
        println("Lives in neighbourhood")
    }
}

class Buffalo(val animal: Animal) : Animal by animal          // delegates all functions with same name to animal object


/** If you don't want a specific function to be delegated to a different class object, you can still do so
 *  by normally overriding it with 'override' keyword
 */

class Dog(val animal: Animal) : Animal by animal {            // delegates all functions with same name to animal object
    override fun eat() {                                      // this will not be delegated to animal object
        println("Eats dog food")
    }
}


fun main() {
    val teslaEngine = TeslaEngine(ElectricEngine())
    teslaEngine.runsOn()

    val buffalo = Buffalo(DomesticAnimal())
    buffalo.makeSound()
    buffalo.eat()
    buffalo.livesIn()

    val dog = Dog(DomesticAnimal())
    dog.makeSound()
    dog.eat()
    dog.livesIn()
}