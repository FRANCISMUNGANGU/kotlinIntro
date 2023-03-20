fun main () {
    //    Equal to a == b
//    Not Equal to: a != b
//    You can use these conditions to perform different actions for different decisions.
//    Kotlin has the following conditionals:
//    Use if to specify a block of code to be executed, if a specified condition is true
//    Use else to specify a block of code to be executed, if the same condition is false
//    Use else if to specify a new condition to test, if the first condition is false
//    Use when to specify many alternative blocks of code to be executed
    var age = 10
    var entryage = 10
    if(age > entryage){
        println("Age is greater than entry age")
    }else if(age != entryage){
        println("else if")
    }else if(age !== entryage){
        println("age equal to entry age")
    }
    else {
        println("Age is not greater than entry age")
    }

//    CONDITIONAL WHEN
    var day = 7
    var result = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Sartuday"
        7 -> "sunday"
        else -> "Invalid day"
    }
    println(result)
    when {
        age > entryage -> {
            println("age greater then entry age")
        }
        age != entryage -> {
            println("age not equal to entry age")
        }
        age == entryage -> {
            println("age equal to entry age")
        }
        else -> {
            println("Age is not greater than entry age")
        }
    }
}