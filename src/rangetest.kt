fun main(args: Array<String>)
{
   val myLambda: (Int) -> Unit = {a: Int -> println(a)}
    addNumbers(x:4, y:9, myLambda)
}


fun addNumbers(x: Int, y:Int, myLambda: (Int) -> Unit)
{
    val add: Int = x+y
    myLambda(add)
}