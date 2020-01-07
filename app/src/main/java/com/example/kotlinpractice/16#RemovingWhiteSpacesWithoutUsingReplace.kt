package com.example.kotlinpractice

fun main(){
removingWhiteSpacesWithoutUsingReplace("hdyl h ASJ h BHN MVB ah ")
}
fun removingWhiteSpacesWithoutUsingReplace(str1:String){
    var char:CharArray=str1.toCharArray()
    var buider:StringBuilder=StringBuilder()
    for (i in char.indices){
        if (char[i]!=' '){
            buider.append(char[i])
        }
    }
    print(buider)

}