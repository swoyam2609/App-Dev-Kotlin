fun main(){
    var Object: Person = Person("Swoyam", "Siddharth")
    var Object1: Person = Person(lastName = "Nayak")

}

class Person public constructor(firstName: String="Shubhank", lastName: String="Nagar"){
    init{
        println("Person Created")
        println("Person created with name $firstName $lastName")
    }
}
