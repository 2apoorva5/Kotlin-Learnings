package interfaces

class Dog(override var animalType: String) : DomesticAnimal(animalType) {
    override fun makeSound() {
        println("${animalType} makes barking sound")
    }
}