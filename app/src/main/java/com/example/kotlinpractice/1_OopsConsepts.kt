package com.example.kotlinpractice

open class College{

    constructor( colour:String, age:Int){


    }
}

class Student(name: String = "Student", age: Int = 45) : College(name, age) {
//    init {
//        println("Student Name: ${name}")
//        println("Student Age: $age")
//    }
}
fun  main(){


val obj: Student =Student()
val obj1=College("jack",8)

}