package com.example.kotlinpractice

fun main() {
    leapYear(2012)
}

fun leapYear(year: Int) {


    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        println("Given year is a Leap year")

    } else {

        println("Given year is not a Leap year")
    }


}