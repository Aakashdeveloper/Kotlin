fun main(args : Array<String>)
{
    println("Hello edureka")
    var Kotlin = Edurkakotlin()
    Kotlin.Edureka="Webinar by edureka"
    println("Output is "+Kotlin.Edureka)

    var a: Int = 10
    var b: Int = 6
    if(a>b)
        println("$a is greater than $b")
    else
        println("Not Pass")


    for(i:Int in 7..1) print(i)


    var numbers: Int =1
    var WheninKotlin:String  = when(numbers)
    {
        1 -> "One"
        2 -> "Two"
        else -> "Invalid Input"
    }

    println("Output is $WheninKotlin")
}