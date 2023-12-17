package functions

/** Extension functions give us ability to extend a class with new functionalities without actually having to inherit
 *  the class.
 *  That class can be any class - mainly used for some third party library classes or JAVA/KOTLIN internal classes to
 *  add some functionalities to it.
 *  Like suppose the String class from JAVA/KOTLIN doesn't have a function to do some operation, we can basically
 *  create a function and add it to the String class for our use like {String.newFunction()}
 */

fun String.reverseSentence(): String {                   // reverseSentence() function added to String class for our use
    if (this.isNotEmpty()) {
        var temp = this.split(" ")
        var newSentence = StringBuilder()

        for (i in temp.indices.reversed()) {
            newSentence.append(temp[i] + " ")
        }

        return newSentence.toString()
    } else {
        return this
    }
}

/** If a class have a member function and a new extension function with same name and signature, the member function
 *  will take over the extension function when calling the function over that class object.
 */

class University {
    fun foo() {                         // member function of University class
        println("foo")
    }
}

fun University.foo() {                  // extension function of University class
    println("foo with extension")
}

fun main(args: Array<String>) {
    var sampleSentence = "I am doing this now"
    println(sampleSentence.reverseSentence())         // call the extension function on the class (String) object directly

    var university = University()
    university.foo()                   // calling a function (member / extension) will actually call the member function
}