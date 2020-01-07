package com.example.kotlinpractice

fun main(){
numberOfVowelsInString()
}
fun numberOfVowelsInString(){
    var line = "AEIUO"
    var vowels = 0
    var consonants = 0

    line = line.toLowerCase()
    for (i in 0..line.length - 1) {
        val ch = line[i]
        when (ch) {
            'a', 'e', 'i', 'o', 'u' -> ++vowels
            in 'a'..'z' -> ++consonants

        }
    }
    println("Vowels: $vowels")
    println("Consonants: $consonants")

}