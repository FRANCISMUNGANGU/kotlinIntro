fun main (){
    val map = mapOf(1 to "Value of o2", 2 to "Value of 2", 3 to 3)
    println("accessing the map "+ map)
    println("accessing the keys "+ map.keys)
    println("accessing the values "+ map.values)

    println("Size is ${map.size}")
    println("Count is ${map.count()}")

    println("To get value 'value of two' " +map[2])
    println("To get value 'value of two' " +map.getValue(2))
    println("To get value 'value of two' " +map.getOrDefault(5, 3))
    println("To get value 'value of two' " +map.getOrElse(5,{3}))

    println(map.containsKey(5))
    println(map.containsValue("Value of 1"))

    val map2 = mapOf(1 to "one", 2 to "two", 1 to "three", 1 to "four")
    println("...................two values same key")
    println(map2.entries)

    val names = mapOf("name" to "Francis", "occupation" to "Software engineer")
    println("The occupation of "+names["name"] + " : " + names["occupation"])
    println(names.containsValue("Francis"))

    for (item in map2.keys){
        val value = map2[item]
        println(value)
    }
    for (item in map2.values){
        println(item)
    }

    map2.forEach{key,value ->
        println("${value}")
        println("${key}")
    }
}