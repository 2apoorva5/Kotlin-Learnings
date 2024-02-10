package functions

/** Scoped or Scope Functions are types of Higher Order Function. We basically have 5 types:
 *
 *  1. object.let { }
 *  2. object.run { }
 *  3. with(object) { }
 *  4. object.apply { }
 *  5. object.also { }
 *
 *  Return Type of different scope functions:
 *
 *  let { } returns Result - can be anything (can be Unit as well)
 *  run { } returns Result - can be anything (can be Unit as well)
 *  with { } returns Result - can be anything (can be Unit as well)
 *  apply { } returns Object
 *  also { } returns Object
 *
 *  Object context for different scope functions:
 *
 *  let { } allows it
 *  run { } allows this
 *  with { } allows this
 *  apply { } allows this
 *  also { } allows it
 *
 *  Object renaming allowed or not in different scope functions:
 *
 *  let { } allows object renaming
 *  run { } doesn't allow object renaming
 *  with { } doesn't allow object renaming
 *  apply { } doesn't allow object renaming
 *  also { } allows object renaming
 *
 *  Null check can be done or not with different scope functions:
 *
 *  let { } allows null check
 *  run { } allows null check
 *  with { } doesn't allow null check
 *  apply { } allows null check
 *  also { } allows null check
 */

data class Man(
    var firstName: String,
    var lastName: String,
    var age: Int,
    var nationality: String
)

fun main() {
    // let { } can return anything

    val letVariable = Man("Apoorva", "Ranjan", 26, "India").let {
        return@let "${it.firstName} is ${it.age} years old."
    }
    println("let: $letVariable")


    // run { } can return anything

    val runVariable = Man("Apoorva", "Ranjan", 26, "India").run {
        return@run "${this.firstName} is based out of ${this.nationality}"
    }
    println("run: $runVariable")


    // with { } can return anything

    val withVariable = with(Man("Apoorva", "Ranjan", 26, "India")) {
        return@with "${this.firstName} ${this.lastName}"
    }
    println("with: $withVariable")


    // apply { } will always return an object

    val applyVariable = Man("Apoorva", "Ranjan", 26, "India").apply {
        "${this.firstName} ${this.lastName} is ${this.age} years old."

        // return@apply this  --  this will not work - you can just have return@apply or completely ignore it
    }
    println("apply: $applyVariable")


    // also { } will always return an object

    val alsoVariable = Man("Apoorva", "Ranjan", 26, "India").also {
        "${it.firstName} is based out of ${it.nationality} and his age is ${it.age}"

        // return@also it  --  this will not work - you can just have return@also or completely ignore it
    }
    println("also: $alsoVariable")
}