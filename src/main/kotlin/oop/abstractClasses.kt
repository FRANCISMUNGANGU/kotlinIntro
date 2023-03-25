abstract class Employee(var name: String, var experience: String){
    abstract val salary: Double

    abstract fun dateofbirth(date: String)


    fun employeeDetails(){
        println("The employee's name is ${name}")
        println("The employee's experience is ${experience}")
    }
}
class Accountant(name: String, experience: String): Employee(name, experience){
    override val salary: Double= 50000.00
    override fun dateofbirth(date: String) {
        println(date)
    }
}

open class Livingthings(){
    open fun Breathin(){
        println("Breath in process")
    }
    }
abstract class Animals:Livingthings(){
    override abstract fun Breathin()

}
class Cat: Animals(){
    override fun Breathin() {
        println("The cat .........")
    }
}
fun main (){
    var employee1 = Accountant("mary", "7")
    employee1.employeeDetails()
    val lt1= Livingthings()
    println(lt1.Breathin())
    val cat = Cat()
    println(cat.Breathin())
}