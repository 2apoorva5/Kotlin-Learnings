package classes

class Customer {

    /** primary constructor - constructors without parameters are called primary constructors
     *  can be only one per class
     */

    constructor() {
        println("This is the primary constructor")
    }


    /** secondary constructor - parametrized constructors are called secondary constructors
     *  can be multiple with diff no. or type of parameters - constructor overloading
     */

    constructor(age: Int) : this() {               // this() will invoke the primary constructor
        println("This is the first secondary constructor")
    }

    constructor(name: String) : this(24) {    // this(24) will invoke the first secondary constructor
        println("This is the second secondary constructor")
    }


    /** init blocks can be multiple
     *  will always get executed first (if present) whenever class object gets instantiated
     *  will get executed in the order they have been written inside the class
     *  constructors will get executed after all the init blocks
     */

    init {
        println("This is the first init block")
    }

    init {
        println("This is the second init block")
    }

    init {
        println("This is the third init block")
    }

    fun sampleFunction() {
        println("This is a sample function")
    }
}

fun main(args: Array<String>) {
    var customer = Customer("Atul")
    customer.sampleFunction()
}