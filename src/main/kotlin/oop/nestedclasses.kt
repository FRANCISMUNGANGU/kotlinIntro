class Car(var make: String, var model: String, var year: Int){



    fun getinfo(): String{
        return "$make $model $year"
    }

    inner class Engine {
        var horsepower: Int = 185
        var cylinders: Int = 4


        fun GetEngineInfo():String{
            return "$horsepower engine horsepower $cylinders engine cylinders"
        }
    }
}
fun main(){
    val myCar = Car("toyota", "corolla", 2019)
    println(myCar.getinfo())
    val engine = myCar.Engine()
    println(engine.GetEngineInfo())
    println(engine.horsepower)
}