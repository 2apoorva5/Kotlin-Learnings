package topics

/** A class can be created or defined inside another class as well. Such a class is called 'NESTED CLASS'.
 *
 *  It can do all basic things a class does
 *  It can have its own variables, its own method
 *  It can extend from other class or interfaces as well
 */

class Person(val name: String?, var address: Address?) {
    class Address(                                                                          // Address is a Nested Class
        val streetName: String,
        val locality: String,
        val city: String,
        val PIN: String
    ) {
        fun displayAddress() {
            println("${streetName}, ${locality}, ${city}")
        }
    }
}

/** As you can see the outer class (Person) has access to nested class's (Address) variables and functions
 *  But, the nested class doesn't have the same access over the outer class
 *
 *  This can be possible with inner class - making the nested class as inner class with 'inner' keyword
 */


class User(val firstName: String?, val lastName: String?, var address: Address?) {
    inner class Address(                                                                    // Address is an inner Class
        val streetName: String,
        val locality: String,
        val city: String,
        val PIN: String
    ) {
        val userName = "${firstName} ${lastName}"                  // inner class has access to outer class's properties

        fun displayAddress() {
            println("${userName} resides in ${streetName}, ${locality}, ${city}")
        }
    }
}

fun main() {
    val person = Person(
        "Apoorva",
        Person.Address(
            "Some Street",
            "Some Locality",
            "Some City",
            "123123"
        )
    )

    person.address?.displayAddress()


    /** Also, inner classes can't be accessed directly by outer class like OuterClass.InnerClass
     *  as in case of Nested Class you can see above
     *
     *  Below is the way to instantiate it -
     */

    val user = User(
        "Apoorva",
        "Ranjan",
        null
    )

    user.address = user.Address(
        "Some Street",
        "Some Locality",
        "Some City",
        "123123"
    )

    user.address?.displayAddress()
}