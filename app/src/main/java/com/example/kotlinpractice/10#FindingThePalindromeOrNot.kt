package com.example.kotlinpractice

fun main(){
findingThePalindromeOrNot("runur")
}

fun findingThePalindromeOrNot(original:String){
    var reverse=""
    var length1:Int
    length1 = original.length
    for (i in length1-1 downTo 0){
        reverse=reverse+original[i]
    }
    println("Reverse is "+reverse)
    if (original.equals(reverse))
    {
        println("It is palindrome")
    }else{
        println("It is not palindrome")
    }
}