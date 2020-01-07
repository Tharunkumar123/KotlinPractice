package com.example.kotlinpractice

fun main(){
   downwardTrianglePattern(7)
}
fun downwardTrianglePattern(n:Int){
    for (l in n downTo 0)
    {
        for (m in 0 until n-l){
            print(" ")
        }
        for (m in l downTo 0){
            print("* ")
        }
        println()
    }
}