package org.example

class MathOperations {
    private var numberOne: Double = 0.0
    private var numberTwo: Double = 0.0
    private var result: Double = 0.0
    fun SetNumber() {
        println("выберите тип операции")
        println("+ - * /")
        var chuse = readLine().toString()
        println("Введите число : ")
        this.numberOne = readLine()?.toDoubleOrNull() ?: 0.0
        println("Введите число : ")
        this.numberTwo = readLine()?.toDoubleOrNull() ?: 0.0
        if (chuse == "+") {
            Add()
        }
        if (chuse == "-") {
            Sub()
        }
        if (chuse == "*") {
            Multiply()
        }
        if (chuse == "/") {
            Divide()
        }
    }
    fun Add(): MathOperations  {
        result = numberOne + numberTwo
        println("сложение " + result)
        return this
    }
    fun Sub(): MathOperations {
        result = numberOne - numberTwo
        println("вычитание " + result)
        return this
    }
    fun Multiply(): MathOperations {
        result = numberOne * numberTwo
        println("умножение " + result)
        return this
    }
    fun Divide(): MathOperations {
        result = numberOne / numberTwo
        println("деление " + result)
        return this
    }
}