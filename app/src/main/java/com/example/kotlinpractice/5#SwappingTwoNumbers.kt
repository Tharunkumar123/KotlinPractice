package com.example.kotlinpractice

import java.util.*

fun main(){
    swappingTwoNumbers()
}
fun swappingTwoNumbers(){
    var x=25
    var y=30
    var temp:Int

    temp=x
    x=y
    y=temp
    println("After Swapping: "+x+y)
}