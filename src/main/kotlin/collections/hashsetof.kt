fun main(){
    val set1 = hashSetOf<Int>(1,2,3)
    val set2 = hashSetOf("1",2,3)
    val set3 = hashSetOf(4,5,6)
    println(set1)
    println(set2)
    for (items in set1){
        println(items)
    }
    set1.add(8)
    println(set1)

    set1.addAll(set3)
    println(set1)

    set2.remove(1)
    println(set2)

    println(set2.elementAt(0))
    println(set2.last())
    println(set2.indexOf(2))
}