package com.example.kotlinpractice

import java.lang.StringBuilder

fun main(args:Array<String>){
    val name = "Vignesh Venkatesh"
    stringReverse(name)
    stringReverseWithoutReerseMethod(name)
}

fun stringReverse(name:String){

   var builder:StringBuilder= StringBuilder()
    builder.append(name)
    builder=builder.reverse()
    println(builder)

}
fun stringReverseWithoutReerseMethod(name:String){
    val token: List<String> = name.split("".toRegex())
    for (i in (name.length-1)downTo 0){
        print(name[i])
    }
}