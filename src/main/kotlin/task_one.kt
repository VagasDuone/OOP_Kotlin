package org.example

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val salecount = 0;
    print("введите число: ")
    val n = readLine()!!.toInt()
    val personList = mutableListOf<Person>()
    repeat(n) {
        print("Ввидите имя: ")
        val name = scanner.nextLine()
        val person = Person(name)
        personList.add(person)
    }
    for (person in personList) {
        person.printName()
    }
}

