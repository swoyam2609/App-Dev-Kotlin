fun main(){
    val number1: IntArray = intArrayOf(1,2,3,4,5,6)
    val number2 = intArrayOf(1,2,3,4,5,6)
    val number3 = arrayOf(1,2,3,4,5,6)
    print(number1.contentToString())
    for(elements in number2){
        println(elements)
    }
    val fruitsArray = arrayOf(Fruits("Apple", 1),Fruits("Mango", 2),Fruits("Guava", 3))
    for(x in fruitsArray.indices){
        println("The price of $x is ${fruitsArray[x]}")
    }
}

data class Fruits(val name: String, val price: Int)