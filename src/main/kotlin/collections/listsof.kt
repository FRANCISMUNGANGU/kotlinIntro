fun main(){
    val number = listOf(1,2,3,4,5)
    val firstnumber = number[0]
    println(number.size)
    val lastnumber = number.size -1
    println(number[lastnumber])
    for (i in number){
        println(i)
    }
    println(number.indexOf(4))
    println("............................first and last")
    println(number.first())
    println(number.last())

    val names = listOf("Francis", "John", "James", "David")
    println(".............................")
    for (name in names){
        println("${name}")
    }
    println("....................................")
    for (i in 0 until names.size){
        println("${names[1]}")
    }
    println("............................................")
    val it: ListIterator<String> = names.listIterator()
    while (it.hasNext()){
        val i = it.next()
        println(i)
    }
    val ascending = names.sorted()
    println("............................accending...................")
    println(ascending)

    val descending = names.sortedDescending()
    println("..................................")
    println(descending)

    println("Checking for a single value in a list")
    val check = names.contains("Francis")
    println(check)
    println("range check.........................")

    val rangeCheck = names.containsAll(listOf("Francis", "James"))
    println(rangeCheck)
    if (rangeCheck){
        println("Name exists")
    } else {
        println("Name does not exist")
    }
}