fun main(){
    for(i in 1..20){
        if(i==10){
            println("Break called")
            break

        }
    }

    for(i in 1..10){
        if(i in 5..8){
            continue
        }
        println("The value if i is $i")
    }
}