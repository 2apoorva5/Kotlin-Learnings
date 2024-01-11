package topics

/** Suppose a class expects some arguments of same types (say Long)
 *  Now, we can mix up the order of the arguments while instantiating, and it would not make a difference
 *  because all are of same types, but it would be wrong
 */

class Rectangle(width: Long, height: Long) {
    private val width: Long? = width
    private val height: Long? = height

    fun printSpecs() {
        println("${this.width}, ${this.height}")
    }
}

/** To prevent such thing, we should restrict the types of parameters in some way.
 *  We can use INLINE CLASS for this purpose
 *  We can create multiple inline classes for the parameters as wrapper around the primitive type
 *  and then create the class with parameters as these inline class types
 *
 *  This will make sure that you pass the parameters as those inline class type only and cannot mix up
 *
 *  This could be done without inline keyword too with normal classes but in that case we would be passing objects
 *  of those classes as parameters, whereas with inline classes, their objects are basically values wrapped around
 *  the primitive types.
 */

inline class Length(val length: Long)                                 // deprecated - use @JvmInline value class instead
inline class Width(val width: Long)                                   // deprecated - use @JvmInline value class instead
inline class Height(val width: Long)                                  // deprecated - use @JvmInline value class instead

class Cuboid(length: Length, width: Width, height: Height) {
    private val length: Length? = length
    private val width: Width? = width
    private val height: Height? = height

    fun printSpecs() {
        println("${this.length}, ${this.width}, ${this.height}")
    }
}

fun main() {
    val width = 50L
    val height = 100L

    val shape1 = Rectangle(width, height)
    val shape2 = Rectangle(height, width)                                       // this is also correct but not expected

    shape1.printSpecs()
    shape2.printSpecs()


    val length1 = Length(70L)
    val width1 = Width(50L)
    val height1 = Height(100L)

    val cuboid1 = Cuboid(length1, width1, height1)
    // val cuboid2 = Cuboid(width1, length1, height1)   ---- this would be wrong as the order of parameters is incorrect

    cuboid1.printSpecs()
}