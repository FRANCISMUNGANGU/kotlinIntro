// Lists in kotlin are an ordered collection of elements that allow duplicates
// to define one : choose whether you want a mutable or immutable list
// ARRAYLIST : objects
// Array lists create dynamic arrays
// by dynamic meaning we have the ability to increase or decrease the size of an array
// arraylists can contain duplicates

// defination
// constructors
//1.ArrayList<E>() : creates an empty ArrayList
//2. ArrayList(capacity:Int) - creates an array list of a specified size
//3. ArrayList(elements: Collection<E>): - creates an array list filled with collection elements


// To add to an arrayList
// add(index:Int , element: E): Boolean
// -1 : referencing the last object in the array list
fun main (){
    var arrayList = arrayListOf<String>()
    arrayList.add("First string")
    arrayList.add("First string")
    println("................................................")
    for (i in arrayList){
        println(i)
    }
    arrayList.add(1,"Second string")
    println("...............................specified index..............................")
    for (i in arrayList){
        println(i)
    }
    var arrayList2 = ArrayList<String>()
    println("...............adding collection....................")
    arrayList2.addAll(arrayList)
    arrayList2.add(1,"third string")
    for (i in arrayList2){
        println(i)
    }
    println("............accessing items using get....................")
    println("Item at first position is: " + arrayList2.get(0))
    println(arrayList2.size)

    println(".........updating using set....................")
    arrayList2.set(0,"changed value")
    for (i in arrayList2){
        println(i)
    }
    println("Index position of third string is: "+ arrayList2.indexOf("third string"))
    println("..................removing..............")
    arrayList2.remove("third string")
    for (i in arrayList2){
        println(i)
    }
    println("..................clearing.......................")
    arrayList2.clear()
    for (i in arrayList2){
        println(i)
    }
    println(arrayList2.size)
}