package com.example.kotlinpractice

fun main(){
secondLargestNumberInArray()
}
fun secondLargestNumberInArray(){
    val arr= arrayOf(13,23,36,34,75,96,77,88)
    var largest=0
    var secondLargest=0
    for (i in 0 until arr.size-1){
        print(" "+arr[i] )
    }
    for (i in 0 until arr.size-1){
        if (arr[i]>largest){
            secondLargest=largest
            largest=arr[i]
        }else if(arr[i] > secondLargest){
            secondLargest=arr[i]
        }

    }
    println("Largest number in an array is: "+largest)
    println("SecondLargest number in an array is: "+secondLargest)
}