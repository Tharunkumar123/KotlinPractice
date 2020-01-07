package com.example.kotlinpractice

fun main() {
armstrongNumber()
}

fun armstrongNumber() {
    var c = 0
    var a: Int
    var temp: Int
    var n = 153
    temp = n
    while (n > 0) {
        a = n % 10
        n = n / 10
c=c+(a*a*a)
    }
    if (temp==c){
        println("Armstrong number")
    }else{
        println("Not Armstrong number")
    }

}