package com.example.kotlinpractice

import java.util.*
import kotlin.collections.HashMap


fun main(args: Array<String>) {
   numberOfWords()
}
fun numberOfWords(){
    val map: MutableMap<String, Int?> = HashMap()

    println("Enter a string:")
    val sentence: String="jibfeuu fuf o feorwfo "
    val tokens =
        sentence.split(" ".toRegex()).toTypedArray()
    for (token in tokens) {
        val word = token.toLowerCase()
        if (map.containsKey(word)) {
            val count = map[word]!!
            map[word] = count + 1
        } else {
            map[word] = 1
        }
    }

    val keys: Set<String> =
        map.keys
    val sortedKeys: TreeSet<String> = TreeSet(keys)
    for (str in sortedKeys) {
        println("Word =" + str + " and it's count = " + map[str])
    }
}