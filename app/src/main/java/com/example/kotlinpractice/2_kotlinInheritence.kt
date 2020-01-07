package com.example.kotlinpractice


open class Animal(color: String, age: Int) {
    init {
        println("Color is: ${color}")
        println("Age is: ${age}")
    }
}

class Dog(color: String , age: Int ) : Animal(color  , age) {
    fun Barks(){
        println("Dog Barks")
    }

}
class Cat(color: String,age: Int):Animal (color, age){
    fun meow(){
        println("Cat makes sound as Meow")
    }
}
fun  main(){

    val dog=Dog("black",3)
    dog.Barks()


}