package org.example

    class Student: Person() {
    val person = Person()
    public var Idstudent: Int = 0

    fun setStudent() {
        println("введите id ")
        val newid = readLine()!!.toInt()
        Idstudent = newid
    }
    fun printStudentDetails() {
        println("Студенский ID: $Idstudent")
    }
}