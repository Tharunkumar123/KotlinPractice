package com.example.kotlinpractice

fun main(){
    sumofNaturalNumbers(10)
}
fun sumofNaturalNumbers(num:Int){
    var sum=0
    for (i in 0..num){
        sum+=i
    }
    println("Sum is: $sum")
}