//create a variable for testing all condition
val age = 16
//create a variable for drinkingAge
val drinkingAge = 21
//create a variable for votingAge
val votingAge = 18
//create a variable for drivingAge
val drivingAge = 16

//Assign the if statement to a variable
val currentAge =  if (age >=drinkingAge){
    println("Now you may drink in the US")
//return the value for this block
    drinkingAge
}else if(age >=votingAge){
    println("You may vote now")
//return the value for this block
    votingAge
}else if (age>=drivingAge){
    println("You may drive now")
//return the value for this block
    drivingAge
}else{
    println("You are too young")
//return the value for this block
    age
}
//print the age for the passing condition
print("current age is $currentAge")