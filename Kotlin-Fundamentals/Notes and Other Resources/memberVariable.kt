class Person public constructor(firstName: String, lastName: String){
    //Member Variables
    var age: Int? = null
    var hobby: String = "Surfing Netflix" //Default hobby for the class Person

    //Member Functions
    fun findHobby(): String{
        return "my hobby is ${this.hobby}"
    }

    //Mmeber secondary constructor
    constructor(firstName: String, lastName: String, age: Int)
        :this(firstName, lastName){
            this.age=age
        }
}

fun main(){
    var Me: Person = Person("Swoyam Siddharth", "Nayak", 19)
    Me.hobby="Playing Table Tennis"
    println(Me.findHobby())
    println(Me.age)
}