fun main() {
    for(x in 1..10){
        println("The value of x is $x")
    }

    for(y in 1 until 10){
        println("The value of y is $y")
    }
    for(z in 10 downTo 1){
        println("The value of z is $z")
    }
    for(a in 10 downTo 1 step 2){
        println("The valus of a is $a")
    }
}