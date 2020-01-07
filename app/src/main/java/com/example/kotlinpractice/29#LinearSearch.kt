package com.example.kotlinpractice




fun main() {
    val a1 = intArrayOf(1340, 2340, 330, 5320, 270, 290)
    val key = 50
    println(key.toString() + " is found at index: " + linearSearch(a1, key))
}
//Finding the index of the key using the Linear Search
fun linearSearch(arr: IntArray, key: Int): Int {
    for (i in arr.indices) {
        if (arr[i] == key) {
            return i
        }
    }
    return -1
}