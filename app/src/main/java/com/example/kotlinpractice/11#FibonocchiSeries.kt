package com.example.kotlinpractice

fun main(){
fibonocchiSeries(10)
}
fun fibonocchiSeries(num:Int){
    var a=0
    var b=0
    var c=1

    for (i in 0 until num){
        a = b

        b = c

        c = a+b
        print("$a ")
    }
}