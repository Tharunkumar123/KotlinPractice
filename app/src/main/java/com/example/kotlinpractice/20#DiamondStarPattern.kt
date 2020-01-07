package com.example.kotlinpractice

fun  main(){
    diamondStarPattern(4)
}
fun diamondStarPattern(n:Int){

    for (i in 0 .. n){
        for (j in n-i downTo 1){
            print(" ")}
        for (j in 1 .. i){
            print("* ")
        }
        println()
    }

    for (l in n downTo 0)
    {
        for (m in 0 .. n-l){
            print(" ")
        }
        for (m in l downTo 2){
            print("* ")
        }
        println()
    }
}
//for (i in 1 until n){
//    for (j in n-i downTo 1){
//        print(" ")}
//    for (j in 1 until i){
//        print("* ")
//    }
//    println()
//}
//
//for (l in n downTo 0)
//{
//    for (m in 0 until n-l){
//        print(" ")
//    }
//    for (m in l downTo 2){
//        print("* ")
//    }
//    println()
//}