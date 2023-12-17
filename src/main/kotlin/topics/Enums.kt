package topics

/** If you want a property to be assigned some certain values only, not any other values, you can use ENUMS
 *  ENUMS are basically set of value options for that property - no other value can be assigned apart from these ENUMS
 *
 *  You can make an enum class by using 'enum' keyword with a class
 */

enum class CoffeeCupSize { MEGA, LARGE, MEDIUM, SMALL }


/** we can also assign value to the enums like this */

enum class ShirtSize (val size: Int) {
    XXXL(46),                           // value assigned to enum XXXL
    XXL(44),
    XL(42),
    L(40),
    M(38),
    S(36),
    XS(34)
}


/** we can also add functionalities to the enums like this */

enum class JeanSize (val size: Int) {
    XXL(36) {
        override fun getInfo(): String {
            return "The jeans is ${this.name} which means it has a size - $size"
        }
    },
    XL(34) {
        override fun getInfo(): String {
            return "The jeans is ${this.name} which means it has a size - $size"
        }
    },
    L(32) {
        override fun getInfo(): String {
            return "The jeans is ${this.name} which means it has a size - $size"
        }
    },
    M(30) {
        override fun getInfo(): String {
            return "The jeans is ${this.name} which means it has a size - $size"
        }
    },
    S(28) {
        override fun getInfo(): String {
            return "The jeans is ${this.name} which means it has a size - $size"
        }
    };

    abstract fun getInfo(): String                   // abstract function that needs to implemented for each enum
}

class Order(val orderSize: CoffeeCupSize)

class Shirt(val shirtSize: ShirtSize)

class Jeans(val jeanSize: JeanSize)

fun main(args: Array<String>) {
    val order = Order(CoffeeCupSize.LARGE)          // can only pass available enums like this
    // val order = Order(EXTRA_LARGE)               // can't be possible to assign any value other than the enums
    println(order.orderSize)

    println(order.orderSize.name)                   // enum name - return the enum name
    println(order.orderSize.ordinal)                // enum ordinal - return the position of that enum

    val shirt = Shirt(ShirtSize.XL)
    println(shirt.shirtSize.size)                   // prints enum value

    val jeans = Jeans(JeanSize.XL)
    println(jeans.jeanSize.getInfo())               // returns the result of enum function
}
