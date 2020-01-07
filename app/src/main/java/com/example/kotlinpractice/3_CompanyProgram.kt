package com.example.kotlinpractice

import com.google.gson.Gson

interface Employee {
    fun employeeData(name: String)
}

interface Manager {
    fun employeeData(name: String)
    fun employees()
}

interface HR {
    fun employeeData(name: String)
    fun employees()
    fun salaryHikes(iD: Int, hike: Int)
}

interface Ceo {
    fun employeeData(name: String)
    fun employees()
}

class Company : Employee, Manager, HR, Ceo {
    lateinit var myModel: ArrayList<MyModel>

    override fun employees() {
        myModel = ArrayList()
        myModel.add(MyModel("Tharun", 1, 100, "Android Developer"))
        myModel.add(MyModel("TharunChittimi", 2, 100, "Android Developer"))
        myModel.add(MyModel("Ramya", 3, 100, "Android Developer"))
        myModel.add(MyModel("Vignesh", 4, 200, "Android Developer"))
        myModel.add(MyModel("Ghouse", 5, 200, "Android Developer"))
        myModel.add(MyModel("Kishore", 6, 200, "Android Developer"))
        myModel.add(MyModel("Satish", 7, 300, "Android Developer"))
        myModel.add(MyModel("Lahari", 8, 100, "IOS Developer"))
        myModel.add(MyModel("Sandeep", 9, 100, "IOS Developer"))
        myModel.add(MyModel("Suneel", 10, 100, "IOS Developer"))
        myModel.add(MyModel("Harsha", 11, 200, "IOS Developer"))
        myModel.add(MyModel("Deeraj", 12, 300, "IOS Developer"))
        myModel.add(MyModel("Hemadri", 13, 500, "Director of technology"))
        println(Gson().toJson(myModel))
    }

    override fun employeeData(name: String) {
        for (i in 0..myModel.size - 1) {
            if (myModel.get(i).nameOfEmployee.equals(name, true)) {
                println(Gson().toJson(myModel[i]))

            }
        }
    }

    override fun salaryHikes(iD: Int, hike: Int) {
for (i in 0..myModel.size-1){
    if (myModel.get(i).id.equals(iD)){
        myModel[i].salary=myModel[i].salary+hike
        println(Gson().toJson(myModel[i]))
    }
}
    }
}

class MyModel(
    val nameOfEmployee: String,
    val id: Int,
    var salary: Int,
    val designation: String
)

fun main() {
    val obj = Company()
    obj.employees()
    obj.employeeData("Tharun")
    obj.salaryHikes(1,200)
}