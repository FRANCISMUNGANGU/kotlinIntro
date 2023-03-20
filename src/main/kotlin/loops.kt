fun main (){
//    for in loop and while loop
    var index = 1
    while (index < 6){
        println(index)
        index++
    }
    println("...........................................................................................")
// do.... while loop
    var i = 1
    do {
        println(i)
        i++
    }while (i < 6)
//    for loops in arrays
    var cars = arrayOf("Toyota", "BMW")
    for (x in cars){
        println(x)
    }
    var example_break = 0
    while (example_break < 10){
        println(example_break)
        example_break++
        if (example_break == 4){
            break
        }
    }
    println("............................................................")
    var example_continue = 0
    while (example_continue < 10){
        if(example_continue == 4){
            example_continue++
            continue
        }
        println(example_continue)
        example_continue++
    }

}