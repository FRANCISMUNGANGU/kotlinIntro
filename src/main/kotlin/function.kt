fun main(){
    myGreeting()
    myGreeting()
    myGreeting()
    mysum(10, 20)
    var sum = mysum2(10, 20)
    println(sum)
    var sum2 = myshorthand(30, 30)
    println(sum2)
}
fun myGreeting(){
    println("Hello world")
}
fun mysum(a: Int, b: Int):Int{
    return (a + b)
}
fun mysum2(a: Int, b: Int):String{
    var sum = a + b
    var finalsum = mysum(sum.toInt(), 10)
    return finalsum.toString()
}
fun myshorthand(x: Int, y : Int) = x + y
// function parameters
// Information can be passed out to functions through parameters
