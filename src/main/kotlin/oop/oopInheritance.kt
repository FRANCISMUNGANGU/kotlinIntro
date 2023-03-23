// ability of oop to allow a child class to inherit the properties and functions of a parent class.
// subclass (child class) -> class that inherits
// superclass (parent class) -> class being inherited from.
// a class is defined to be superclass if it starts with the keywords open class Classname
//superclass
open class Myparentclass{
    val x = 5
    open fun customFunction(){
        println("Here from parent")
    }

}
class Mychildclass(var name:String): Myparentclass(){
    fun childFunction(){
        println(x)
    }

    override fun customFunction() {
        println("Here from child")
    }
}
fun main(){
    val myObject = Mychildclass("Francis")
    println(myObject.childFunction())
    println(myObject.customFunction())
}