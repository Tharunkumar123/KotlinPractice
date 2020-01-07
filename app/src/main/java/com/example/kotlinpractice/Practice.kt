

fun main(args: Array<String>) {

//  1.      Example using  val
    val name = "Tharun"
    print(name)



//2.    Example using  var
    var name1 = "TharunKumar"
    println("\n$name1")

    name1 = "TharunChittimi"
    println(name1)


//3.  Assigning the value to the variable later
    val age:Int
    age=22
    println("Age is: $age")



//4. Casting the numbers
    val num =100
    val numlong:Long=num.toLong()
    println("Long number is: $numlong")



//  5.   this has some doubt
    val num3:Char=num.toChar()
    println(num3)


// 6.   casting Int to string
    val numstrig:String=num.toString()
    println(numstrig)

//7. Arithematic Operations have been done in this example

    val  a=120
    val b=60
    println("Value of a: $a")
    println("Value of a: $b")
    //Addition

println("Addition of a and b is: ${a+b}")

    // Multiplications
    println("Multiplication of a and b is: ${a*b}")

    // Subtraction
    println("Subtraction of a and b is: ${a-b}")


    // Division
    println("Division of a and b is: ${a/b}")


    // Modulo
    println("Modulo of a and b is: ${a%b}")




    // Examples with String
    var strin1="TharunKumar"
    var strin2="Tharun"
    var  strin3="THARUNKUMAR"

    // printing the length of the string
     println("String1 is: $strin1, Length of String1 is: ${strin1.length}")
    println("String2 is: $strin2, Length of String2 is: ${strin2.length}")
    println("String3 is: $strin3, Length of String3 is: ${strin3.length}")

// checking and comparing the strings
    println("String2 contains in string1: ${strin1.contains(strin2)}")
    println("String3 Equals  string1 without ignorecase: ${strin1.equals(strin3)}")
    println("String3 Equals  string1 with ignorecase: ${strin1.equals(strin3,true)}")


    //getting the values using the index
    println("Get the Character by using IndexValue: ${strin1.get(5)}")
    println("Get the index by using Value: ${strin1.indexOf("K")}")
    println("Get the Value of Index from 3 to 8: ${strin1.subSequence(3,8)}")




}
