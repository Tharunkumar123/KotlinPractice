package com.example.kotlinpractice

fun main(){
factorialOfNumber(10)
}
fun factorialOfNumber(num:Int){
    var fact:Long=1
    for (i in 1..num){
        fact*=i
    }
    println("Factorial is: $fact")
}