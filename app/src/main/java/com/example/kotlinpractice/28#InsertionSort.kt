package com.example.kotlinpractice




fun main() {
    val arr1 = arrayOf(924,4414, 43, 24, 434, 121, 528, 242)
    println("Before Insertion Sort")
    for (i in arr1) {
        print("$i ")
    }
    println()
    insertionSort(arr1)
    println("After Insertion Sort")
    for (i in arr1) {
        print("$i ")
    }
}
//sorting array using insertion sort
fun insertionSort(array: Array<Int>) {
    val n = array.size
    for (j in 1 until n) {
        val key = array[j]
        var i = j - 1
        while (i > -1 && array[i] > key) {
            array[i + 1] = array[i]
            i--
        }
        array[i + 1] = key
    }
}