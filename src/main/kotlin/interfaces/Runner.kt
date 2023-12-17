package interfaces

fun main(args: Array<String>) {
    var tiger: Animal = Tiger("Tiger", "huge trees")
    tiger.makeSound()
    (tiger as Cats).climb()                         // call functions associated with interfaces like this

    var cat: Animal = Cat("Cat", "small walls")
    cat.makeSound()
    (cat as Cats).climb()                           // call functions associated with interfaces like this
}