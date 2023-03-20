// use strings to store texts
fun main () {
    var name = "Francis"
    println(name[0])
    println(name[5])
//    length
    println(name.length)
//    conversion to uppercase or lowercase
    println(name.toUpperCase())
    println(name.toLowerCase())
//    comparing two sets of strings
    var name2 = "Francis "
    println(name.compareTo(name2))
//    find string within string
    var hellotext = "Please find me in me"
    println(hellotext.indexOf("me"))
//    joining two string
    var greeting = "Hello"
    println(greeting + " " + name2)
    println(greeting.plus(name2))
    var lastname = "Mung'ang'u"
    println("My name is $name $lastname")
}