import java.lang.IllegalArgumentException

class Person public constructor(firstName: String, lastName: String){
    //Member Variables
    var age: Int? = null
    var hobby: String = "Playing Football"//Default hobby for the class Person
    //Creating a custom getter
    get(){
        return field.toLowerCase()
    }

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

class Car(){
    var maxSpeed : Int
    get(){
        return field
    }
    private set(value){
        if(value>0){
            field = value
        }
        else{
            throw IllegalArgumentException("The speed of the car can't be negetive")
        }
    }
}

fun main(){
    var Me: Person = Person("Swoyam Siddharth", "Nayak", 19, "Playing Football")
    println(Me.findHobby())
    println(Me.age)
}