fun myFunction(){
    println("My function was called")
}

fun addTwoNumber(a: Int, b: Int) : Double {
    return (a+b)/2.0
}

fun main(){
    myFunction()
    println("The sum of 4 and 5 is ${addTwoNumber(4,5)}")
}