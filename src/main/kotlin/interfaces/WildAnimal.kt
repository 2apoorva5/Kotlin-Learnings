package interfaces

open class WildAnimal(override var animalType: String) : Animal() {
    override fun makeSound() {
        println("${animalType} makes wild sounds")
    }
}