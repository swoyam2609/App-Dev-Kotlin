class Person public constructor(firstName: String, lastName: String){
    //Member Variables
    var age: Int? = null
    lateinit private var hobby: String = "Surfing Netflix" //Default hobby for the class Person

    //Member Functions
    fun findHobby(): String{
        return "my hobby is ${this.hobby}"
    }

    //Mmeber secondary constructor
    constructor(firstName: String, lastName: String, age: Int, myHobby: String)
        :this(firstName, lastName){
            this.age=age
            this.hobby=myHobby
        }
}

fun main(){
    var Me: Person = Person("Swoyam Siddharth", "Nayak", 19, "Playing Football")
    println(Me.findHobby())
    println(Me.age)
}