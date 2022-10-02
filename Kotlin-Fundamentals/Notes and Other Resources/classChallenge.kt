fun main(){
    val iphone = MobilePhone("iOS", "Apple", "iPhone 12")
    val galaxyS20 = MobilePhone("Android","Samsung", "Galaxy S20")
    val mateXS = MobilePhone("Android", "Huawei", "Mate X S")
}

class MobilePhone(osName: String, brand: String, model: String){

    private var battery = 30

    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }

    fun chargeBattery(chargedBy: Int){
        println("Battery was at $battery and is at ${battery+chargedBy} now")
        battery += chargedBy
    }
}