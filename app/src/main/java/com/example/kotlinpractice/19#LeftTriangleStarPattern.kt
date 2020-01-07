package com.example.kotlinpractice



fun main(){
    rightTriangleStarPyramid(8)
}
fun rightTriangleStarPyramid(n:Int){
    for (i in 0 .. n){
        for (j in 2*(n-i)downTo 0){
            print(" ")
        }
        for (j in 0 until  i){
            print("* ")
        }
        println()
    }

}