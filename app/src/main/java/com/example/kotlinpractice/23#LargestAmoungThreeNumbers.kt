package com.example.kotlinpractice

fun main(){
   largestAmoungThreeNumbers(3,9,4)
}
fun largestAmoungThreeNumbers(a:Int,b:Int,c:Int){
    if (a>b&&a>c){
        println("a is the largest number")
    }else if (b>a&&b>c){
        println("b is the largest number")
    }else{
        println("c is the largest number")
    }

}