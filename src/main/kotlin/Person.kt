package org.example

import java.util.*

open class Person(
    public var name: String = "")
 {
        fun setName() {
            println("введите имя:")
            this.name = readln().toString()
        }

        fun printName() {
            println("Name: $name")
        }
}