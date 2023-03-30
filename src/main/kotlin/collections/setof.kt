fun main(){
    val set1 = setOf("Geek","Wiz","IT")
    val set2 = setOf("Geek","Wiz","IT",7,true)
    for (item in set1){
        println(item)
    }
    println(set1.elementAt(2))
    println(set2.indexOf(true))
    println(set2.lastIndexOf("Wiz"))

    println(set1.first())
    println(set1.last())

    val num = setOf<Int>(0,1,2,10,100,200,1000000000)
    println("...........................integer functions..................................")
    println(num.count())
    println(num.max())
    println(num.min())
    println(num.sum())
    println(num.average())

    println(set2.contains("Francis"))
    println(set2.containsAll(setOf("Wiz","IT",7,true)))

    println(set1.isEmpty())

    val set3 = setOf(1,2,3,4)
    val set4 = setOf(1,2,3,4)
    val set5 = setOf(1,2,3,4)
    val set6 = setOf(true,2,3,4)

    println("Is set 3 equal to set 4: ${set3 == set4}")
    println("Is set 5 equal to set 6: ${set5 == set6}")
}