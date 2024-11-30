package org.example


fun main(args: Array<String>) {
    print("введите число")
    val n = readLine()!!.toInt()
    for (i in 1..n) {

        val person = Person()
        println("введите имя")
        person.setName()
        person.printName()
    }
}

open class Person() {

    private var name: String = ""
    fun setName() {
        var newName = name
        this.name = newName
        name = readLine().toString()
    }

    fun printName() {
        println("Name: $name")
    }
}
