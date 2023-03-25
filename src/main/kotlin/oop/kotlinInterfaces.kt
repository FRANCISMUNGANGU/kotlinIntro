// interfaces is the feature of oop that is basically a collection of abstract methods and properties that define
//common contract for classes that implement the inerface

// creating an interface: use keyword interface
interface Vehicle {
    fun start(process: String)
    fun startprintprocess(){
        println("This is a default process in interfaces")
    }
    fun stop()
}

class CarInterface: Vehicle {
    override fun start(process: String) {
        TODO("Not yet implemented")
    }

    override fun stop() {
        TODO("Not yet implemented")
    }

    override fun startprintprocess() {
        super.startprintprocess()
    }
}
interface InterfaceProperties{
    val a : Int
    val b : String
        get()= "Hello"
}

class PropertiesDemo: InterfaceProperties{
    override val a: Int = 1000
    override val b: String = "Property override"

}

interface Measurements{
    var length: Int
    val width: Int
    fun printMeasurements()
}

interface CalculationArea: Measurements{
    fun area()
    fun perimeter()
}
class CostructorClass: CalculationArea, InterfaceProperties{
    override var length: Int = 10
    override val width: Int = 10
    override val a: Int = 20
    override fun area() {
        TODO("Not yet implemented")
        var area = length * width
        println(area)
    }

    override fun perimeter() {
        TODO("Not yet implemented")
    }

    override fun printMeasurements() {
        TODO("Not yet implemented")
    }
}
fun main(){
    var ab = PropertiesDemo()
    println(ab.a)
    var c = CostructorClass()
    println(c.area())
}

