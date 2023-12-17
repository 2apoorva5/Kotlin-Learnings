package interfaces

class Tiger(override var animalType: String, override val climberOf: String) : WildAnimal(animalType), Cats {
    override fun makeSound() {
        println("${animalType} makes roaring sound")
    }

    override fun climb() {
        println("${animalType} climbs ${climberOf}")
    }
}