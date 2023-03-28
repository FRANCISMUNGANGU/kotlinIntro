// used to store multiple values in a single variable
// to create an array use the array function
fun main () {
    var cars = arrayOf("BMW", "TOYOTA", "MERCEDES")
//    To access objects use index positon
    println(cars[1])
    println(cars[2])
    println(cars[0])
    cars[1] = "Jeep"
    println(cars[1])
    println(cars.size)

    if ("Toyota" in cars) {
        println("It exists")
    }else {
        println("Jaba")
    }
    println("................................")
    for(x in cars){
        println(x)
        if(x == "Jeep"){
            println("You have reached jeep")
        }
    }
}