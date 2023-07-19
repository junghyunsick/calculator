package com.example.caculator
import java.util.Scanner
class Calculator {
    fun calculate(operator: Char, operater1: Double, operater2: Double): Double {
        return when (operator) {
            '+' -> operater1 + operater2
            '-' -> operater1 - operater2
            '*' -> operater1 * operater2
            '/' -> operater1 / operater2
            '%' -> operater1 % operater2
            else -> throw IllegalArgumentException("잘못된 연산자입니다.")
        }
    }
}

fun main() {
    val input = Scanner(System.`in`)
    val operater1 = readLine()!!.toDouble()
    val operator = input.next()[0]
    val operater2 = readLine()!!.toDouble()


    val calculator = Calculator()

    val result = calculator.calculate(operator, operater1, operater2)
    println("결과: $result")

}
