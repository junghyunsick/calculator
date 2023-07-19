package com.example.caculator

import java.util.Scanner

interface Operation {
    fun operate(operater1: Double, operater2: Double): Double
}

class AddOperation : Operation {
    override fun operate(operater1: Double, operater2: Double): Double {
        return operater1 + operater2
    }
}

class SubtractOperation : Operation {
    override fun operate(operater1: Double, operater2: Double): Double {
        return operater1 - operater2
    }
}

class MultiplyOperation : Operation {
    override fun operate(operater1: Double, operater2: Double): Double {
        return operater1 * operater2
    }
}

class DivideOperation : Operation {
    override fun operate(operater1: Double, operater2: Double): Double {
        if (operater2 == 0.0) {
            throw IllegalArgumentException("나누는 수는 0이 될 수 없습니다.")
        }
        return operater1 / operater2
    }
}

class Calculator {
    fun performOperation(operation: Operation, operand1: Double, operand2: Double): Double {
        return operation.operate(operand1, operand2)
    }
}

fun main() {
    val input = Scanner(System.`in`)
    print("첫 번째 값을 입력하세요 : ")
    val operater1 = readLine()!!.toDouble()
    print("원하시는 연산을 입력하세요 : ")
    val operation = input.next()[0]
    print("두 번째 값을 입력하세요 : ")
    val operater2 = readLine()!!.toDouble()

    val add = AddOperation()
    val sub = SubtractOperation()
    val mul = MultiplyOperation()
    val div = DivideOperation()
    val calculator = Calculator()

    val result = when (operation) {
        '+' -> calculator.performOperation(add, operater1, operater2)
        '-' -> calculator.performOperation(sub, operater1, operater2)
        '*' -> calculator.performOperation(mul, operater1, operater2)
        '/' -> calculator.performOperation(div, operater1, operater2)
        else -> throw IllegalArgumentException("잘못된 연산자입니다.")
    }

    println("결과: $result")
}
