package com.example.kotlinpractice

fun main(args: Array<String>) {

    var number = 1
    while (number <= 5) {
        if (primeNumbers(number))
            println(number)
        number++
    }
}

fun primeNumbers(number: Int): Boolean {
    var condition = true
    for (n in 2 until number)
        if (number % n == 0) {
            condition = false
            break
        }
    return condition
}




