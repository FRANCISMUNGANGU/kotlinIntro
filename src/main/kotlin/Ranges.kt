fun main(){
//    create range using a for i loop
    for (char in 'a'..'x'){
        println(char)
    }
    for(num in 1 .. 10){
        println(num)
    }
    var nums = 1 .. 10
    if (2 in nums){
        println("Number in range")
    }else{
        println("Number out of range")
    }
    println("...........................................................................")
    for (digits in 1 .. 10){
        if(digits == 4){
            break
        }
        println(digits)
    }
    println("...................................................................")
    for (digit in 1 .. 10){
        if(digit == 4){
            continue
        }
        println(digit)
    }
}