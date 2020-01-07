package com.example.kotlinpractice

fun main(){
    downwardTriangleStarPattern(7)
}
fun downwardTriangleStarPattern(n:Int){
    for (l in n downTo 0)
{
    for (m in 1 until n){
        print(" ")
    }
    for (m in l downTo 0){
        print("* ")
    }
    println()
}
}