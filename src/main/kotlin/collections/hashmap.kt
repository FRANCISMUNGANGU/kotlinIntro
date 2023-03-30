fun main(){
    val myMap = hashMapOf<String, Int>()
    myMap.put("grade1",1000)
    myMap.put("grade2",100)
    myMap.put("grade3",10)
    println(myMap)

    myMap.remove("grade3")
    println(myMap)

    println(myMap.containsValue(10))
}