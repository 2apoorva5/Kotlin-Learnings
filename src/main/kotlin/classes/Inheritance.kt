package classes

/** Any class can be derived from a class - Inheritance
 *  The class that is getting derived is called  Derived / Child / Sub class
 *  The class that is being used to derive another class is called its Parent / Super class
 *  For a class to be eligible for Parent class, it should be 'open'
 *  without the 'open' keyword with a class, we cannot derive another class from it
 *  All the Child Classes can access or have access to any functions defined in the Parent class
 *  If any child class wants to have its own definition of same function defined in the parent class, it can have so with function overriding
 *  To override a Parent class function in the child class, that function also should be 'open'
 */

open class Animal {
    open fun makeSound() {
        println("Make generic sound")
    }
}

open class WildAnimal : Animal() {
    override fun makeSound() {
        println("Make wild animal sound")
    }
}

open class DomesticAnimal : Animal() {
    override fun makeSound() {
        println("Make domestic animal sound")
    }
}

class Tiger : WildAnimal() {
    override fun makeSound() {
        println("Make roaring sound")
    }
}

class Dog : DomesticAnimal() {
    override fun makeSound() {
        println("Make barking sound")
    }
}

class Cat : DomesticAnimal() {
    override fun makeSound() {
        println("Make purring sound")
    }
}

fun main(args: Array<String>) {
    var dog: Animal = Dog()
    dog.makeSound()

    var cat: DomesticAnimal = Cat()
    cat.makeSound()

    var tiger: WildAnimal = Tiger()
    tiger.makeSound()

    var wildAnimal: Animal = WildAnimal()
    wildAnimal.makeSound()

    var domesticAnimal: Animal = Animal()
    domesticAnimal.makeSound()
}