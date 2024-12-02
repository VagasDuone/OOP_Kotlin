package org

import org.example.Person
import org.example.Student

fun main(args: Array<String>) {
    val person = Person()
    val student = Student()
    println("количество студентов")
    val n = readLine()!!.toInt()
    val personList = mutableListOf<Person>()
    val studentList = mutableListOf<Student>()
    repeat (n) {
    person.setName()
    student.setStudent()
        val personame = Person(name = person.name)
        personList.add(personame)

        val Idstud = Student()
        Idstud.Idstudent = student.Idstudent
        studentList.add(Idstud)
    }
        for (personame in personList) {
            personame.printName()
        }
        for (student in studentList) {
            student.printStudentDetails()
        }
}
