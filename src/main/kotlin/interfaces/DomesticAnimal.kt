package interfaces

open class DomesticAnimal(override var animalType: String) : Animal() {
    override fun makeSound() {
        println("${animalType} makes domestic sounds")
    }
}