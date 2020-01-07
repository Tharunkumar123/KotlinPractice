package com.example.kotlinpractice



fun main() {
    val arr = arrayOf(33, 630, 353, 32, 345, 320, 35)
    println("Array Before Bubble Sort")
    for (i in arr.indices) {
        print(arr[i].toString() + " ")
    }
    println()
    bubbleSort(arr)
    //sorting array elements using bubble sort
    println("Array After Bubble Sort")
    for (i in arr.indices) {
        print(arr[i].toString() + " ")
    }
}
//Function to get the Bubble sorting
fun bubbleSort(arr: Array<Int>) {
    val n = arr.size
    var temp: Int
    for (i in 0 until n) {
        for (j in 1 until n - i) {
            if (arr[j - 1] > arr[j]) {

                temp = arr[j - 1]
                arr[j - 1] = arr[j]
                arr[j] = temp
            }
        }
    }
}