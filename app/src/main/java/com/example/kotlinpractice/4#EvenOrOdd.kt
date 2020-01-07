package com.example.kotlinpractice

fun main(){
    evenOrOdd(1)
}
fun  evenOrOdd(i:Int){
    if (i%2==0){
        println("$i is even number")
    }
    else{
        println("$i is odd number")
    }
}