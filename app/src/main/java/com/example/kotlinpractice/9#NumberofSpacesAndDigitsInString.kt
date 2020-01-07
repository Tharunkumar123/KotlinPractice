package com.example.kotlinpractice

fun main(){
    numberOfSpacesAndDigitsInString()
}
fun numberOfSpacesAndDigitsInString(){
    var line = "This website has 404 Error."

    var digits = 0
    var spaces = 0
    line = line.toLowerCase()
    for (i in 0..line.length - 1) {
        val ch = line[i]
        when (ch) {

            in '0'..'9' -> ++digits
            ' ' -> ++spaces
        }
    }

    println("Digits: $digits")
    println("White spaces: $spaces")
}