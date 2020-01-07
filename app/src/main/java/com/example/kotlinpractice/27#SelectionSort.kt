package com.example.kotlinpractice



fun main() {
    val arr1 = arrayOf(239, 1432, 35, 25, 434, 411, 528, 422)
    println("Before Selection Sort")
    for (i in arr1) {
        print("$i ")
    }
    println()
    selectionSort(arr1)

    println("After Selection Sort")
    for (i in arr1) {
        print("$i ")
    }
}

//Function used to write the Selection sort
fun selectionSort(arr: Array<Int>) {
    for (i in 0 until arr.size - 1) {
        var index = i
        for (j in i + 1 until arr.size) {
            if (arr[j] < arr[index]) {
                index = j
            }
        }
        val smallerNumber = arr[index]
        arr[index] = arr[i]
        arr[i] = smallerNumber
    }
}