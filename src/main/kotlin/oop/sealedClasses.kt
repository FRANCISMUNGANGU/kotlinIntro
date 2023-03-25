sealed class MysealedClass{
    class A: MysealedClass(){
        fun display(){
            println("Hello from seal a")
        }
    }
    class B: MysealedClass(){
        fun display(){
            println("Hello from seal b")
        }
    }
}
fun main (){
    var myObj = MysealedClass.A()
    println(myObj.display())
}