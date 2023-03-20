// variable is container for storing data
// use var or val
// var = can be changed
// val = cannot be changed

fun main(){
    var name = "Joseph"
    println(name)
    name = "Mary"
    println(name)
    val name2 = "Francis"  // this cannot be changed(immutable)
    println(name2)
    // DATA TYPES
    val MyNum : Int = 5  // Int
    val MyDouble : Double = 5.99 // double or float
    val MyLetter : Char = 'D'  // Char
    val MyString: String = "Download"  // string
    val myBoolean = true  // true or false


//    INTERGER TYPES
//    byte : from -128 to 127
    val byteNum: Byte = 126
//    short: from -32768 to 32767
    val shortNum: Short = 5000
//  Int : from -2147483648 to 2147483647
    val intNum: Int = 1000000
//    long : from -9223372036854775807 to 9223372036854775807
//    must end with an L to show number is long
    val longNum: Long = 15555555555555L

//    Type conversion
    // number if inbuilt methods like( toByte, toShort, toInt, toLong, toFloat, toDouble, toChar, toString)
    val x: Int = 5
    val y: Long = x.toLong()
    println(y)
    // Arithmetic operations
    val price = "5000"
    val discount = 50
    println(price.toInt()- discount.toInt())
    // arithmetic processes
//    + addition
//    - subtraction
//    * multipliction
//    / division
//    % modulus reminder
//    ++ increament, add 1 to value
//    -- decreament, sutracts 1 from value




//    ASSIGNMENT OPERATORS
    var xy = 5
    println(xy)
    xy += 5
    println(xy)
//    COMPARISON OPERATORS
//    ==
//    >
//    <
//    >=
//    <=
//get table from python
    var age = 10
    var entryage = "10"
    println(age == entryage.toInt())

//    LOGICAL OPERATORS
//    Operator           name           description                                   example
//    &&                 and          returns true if both statements are true        x < 5 && x < 10
//    ||                 or           returns true if one statement is true           x < 5 || X < 4
//    !                  not          returns the result, returns false if result is true


    println(age == 10 && entryage.toInt() == 10)
    println(age == 9 || entryage.toInt() == 10)
    var result = age != 10 || entryage.toInt() != 10
    println(!result)

}


