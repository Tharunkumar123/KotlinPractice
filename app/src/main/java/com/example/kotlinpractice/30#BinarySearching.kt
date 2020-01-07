package com.example.kotlinpractice



fun main() {
    val arr = intArrayOf(1320, 204, 30435, 40435, 54510)
    val key = 30
    val last = arr.size - 1
    val result = binarySearch(arr, 0, last, key)
    if (result == -1){
        println("Element is not found!")
    } else {
        println("Element is found at index: $result")
    }
}
//Finding the key index using the Binary Search
fun binarySearch(arr: IntArray, first: Int, last: Int, key: Int): Int {
    if (last >= first) {
        val mid = first + (last - first) / 2
        if (arr[mid] == key) {
            return mid
        }
        return if (arr[mid] > key) {
            binarySearch(arr, first, mid - 1, key)
        } else {
            binarySearch(arr, mid + 1, last, key)
        }
    }
    return -1
}