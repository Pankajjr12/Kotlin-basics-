

fun main()
{
val res1=Movie(name = "Avengers",rating = 9.1,directedBy = "Russo Brothers")
    val res2=Movie(name = "Interstellar",rating = 8.5,directedBy = "Christopher Nolan")
    val res3=Movie(name = "Avatar",rating = 9.1,directedBy = "James Cameroon")
    val res4=Movie(name = "Titanic",rating = 9.1,directedBy = "James Cameroon")
    val res5=Movie(name = "The Lords of the Rings",rating = 9.4,directedBy = "Peter Jackson")
    val res6=Movie(name = "Harry Potter",rating = 9.1,directedBy = "David Yates")
    val res7=Movie(name = "Jurassic World",rating = 9.8,directedBy = "Colin Trevorrow")
    val res8=Movie(name = "The Martian",rating = 8.1,directedBy = "Ridley Scott")
    var myList=mutableListOf(res1,res2,res3,res4,res5,res6,res7,res8)
    for(res in myList)
    {
        println(res)
    }
}