data class ourClass(val iD: Long, val Name: String)

fun main(){
    var User1: ourClass = ourClass(65, "Swoyam")
    println(User1)
    var (roll:Int, myName:String) = User1
}
