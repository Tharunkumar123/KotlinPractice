package com.example.kotlinpractice

fun main(){
findingDuplicateCharacters()
}
fun findingDuplicateCharacters(){
    val str="TharunKumar"
    var count=0
    var chare:CharArray=str.toCharArray()
    for (i in 0 until str.length){
        for (j in i+1 until str.length){
            if (chare[i]==chare[j]){
                println(chare[j])
                count++
                break
            }
        }
    }
}