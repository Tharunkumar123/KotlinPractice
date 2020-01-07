package com.example.kotlinpractice

fun main(){
    swappingNumbersWithoutThirdVariable()
}
fun swappingNumbersWithoutThirdVariable(){
    var x:Int=25
    var y:Int=32
    x=x+y
    y=x-y
    x=x-y
    println("After Swapping: "+x+y)

}