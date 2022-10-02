class MobilePhone(osName: String, brand: String, model: String){
    init{
        println("Mobile Phone created with the following properties")
        println("OS Name = $osName")
        println("Brand = $brand")
        println("Model = $model")
    }
}

fun main(){
    var phone1: MobilePhone = MobilePhone("Android", "Samsung", "Galaxy Note 20 Pro")
}