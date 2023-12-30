package topics

/** When you want to prevent a class to be extended by another class present in a different file in a
 *  different package, you can do so by making that class as 'sealed class'
 *  'sealed' is the keyword needs to be used with such classes
 *
 *  So, if you create a class and want that class to be used to derive other classes within the same file,
 *  you will be able to do so.
 *  But, if you try to derive a class from that sealed class in a different file in a different package,
 *  you won't be able to do it.
 *
 *  The constructors in sealed class are either protected (by default) or private. That's why they can't be
 *  used in a different file of a different package to derive a class.
 *
 *  Sealed classes are like ENUMS for class derivations from another class.
 *
 *  The main advantage of this is you cannot randomly create a class by deriving it from a sealed class
 *  present in some other package or part of a third party library. You'll need to have access to the file in
 *  which the sealed class was defined.
 */

sealed class Student {                // you won't be able to derive a class from Student in a file in different package
    var name = "Apoorva"
}

class UnderGraduateStudent : Student()

class PostGraduateStudent : Student()

class DoctorateStudent : Student()

fun main() {
    val underGraduateStudent: Student = UnderGraduateStudent()
    println(underGraduateStudent.name)

    val postGraduateStudent: Student = PostGraduateStudent()
    println(postGraduateStudent.name)

    val doctorateStudent: Student = DoctorateStudent()
    println(doctorateStudent.name)
}