fun main(args : Array<String>)
{
    val number : Int = 25
  // number  = number + 10 // Kotlin: Val cannot be reassigned
    println("Number not incremented using val keyword")
    var number1 : Int =25
    number1 = number1 + 10
    println("Number incremented using var keyword becomes $number1")

}
