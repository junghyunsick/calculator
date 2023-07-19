package com.example.caculator
import java.util.Scanner
class Calculator1 {
    fun calculate1(operator: Char, operater1: Double, operater2: Double): Double {
        return when (operator) {
            '+' -> operater1 + operater2
            '-' -> operater1 - operater2
            '*' -> operater1 * operater2
            '/' -> operater1 / operater2

            else -> throw IllegalArgumentException("잘못된 연산자입니다.")
        }
    }
}

fun main() {

    val input = Scanner(System.`in`)
    print("첫 번째 값을 입력하세요 : ")
    val operater1 = readLine()!!.toDouble()
    print("원하시는 연산을 입력하세요 : ")
    val operator = input.next()[0]
    print("두 번째 값을 입력하세요 : ")
    val operater2 = readLine()!!.toDouble()


    val calculator1 = Calculator1()

    val result = calculator1.calculate1(operator, operater1, operater2)
    println("결과: $result")

}
