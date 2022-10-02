fun main(){
    var name: String = "Swoyam"
    var nullableName: String? = "Siddharth"
    nullableName = null

    if(nullableName!=null){
        println(nullableName.length)
    }
    else{
        println(null)
    }

    var len = nullableName?.length

    //Assigning the value of a nullable variable to a non nullable variable
    //This is Elvis Operator
    var name = nullableName?:"Naincy"
}

