package com.example.kotlinpractice

fun main(){
starPyramidPatter(5)
}
fun starPyramidPatter(n:Int){
    for (i in 0 .. n){
        for (j in n-i downTo 1){
        print(" ")}
        for (j in 0 until i){
            print("* ")
        }
        println()
    }

}