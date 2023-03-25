fun main(){
    data class person(val name: String,val gender: String, var height: Double)
    val person1 = person("Francis", "male", 5.8)
    println(person1.toString())
    data class car(val model: String, val make: String){
        var enginetype = "xyz"
    }
    val car1 = car("corolla", "toyota")
    val car2 = car1.copy(model = "camry")
    car1.enginetype= "zyx"
    println(car1.enginetype)
    println(car2.toString())


    val person2 = person1.copy(name = "James")
    val person3 = person1.copy()

    val hash1 = person1.hashCode()
    val hash2 = person2.hashCode()
    val hash3 =person3.hashCode()

    println(hash1)
    println(hash2)
    println(hash3)


    println("hash1 is equal to person hash2 ${hash1.equals(hash2)}")
    println("hash2 is equal to person hash3 ${hash2.equals(hash3)}")
    println("hash1 is equal to person hash3 ${hash1.equals(hash3)}")
}