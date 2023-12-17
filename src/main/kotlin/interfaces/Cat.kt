package interfaces

class Cat(override var animalType: String, override val climberOf: String) : DomesticAnimal(animalType), Cats {
    override fun makeSound() {
        println("${animalType} makes purring sound")
    }

    override fun climb() {
        println("${animalType} climbs ${climberOf}")
    }
}