package com.example.kotlinpractice

fun main(){
    leftTriangleStarPyramid(3)
}
fun leftTriangleStarPyramid(noOfLines:Int){
    for (i in 0..noOfLines){

        for (j in 0 until  i){
            print("* ")
        }
        println()
    }

}