/* fun main(args : Array<String>){
     val name = args.get(0)
        println("Hello $name!")
    }*/

fun main(){
    val name = "Olena"
    println("Hello $name!")
    printMessage(name) //1

    printMessageWithPrefix(name) //2
    printMessageWithPrefix(name, "Custom Info Parameter") //2
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")

    val sum = sum(8, 2) //3
    printMessage(sum.toString())
    println(sum)

    val multiplyResult = multiply(8, 2)  // 4
    printMessage(multiplyResult.toString())
    println(multiplyResult)
}


fun printMessage(message: String): Unit {   // 1 Unit no return value, no need to write
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Default Info Parameter") { // 2
    println("$prefix $message")
}

fun sum(x: Int, y: Int): Int {                                          // 3
    return x + y
}

fun multiply(x: Int, y: Int) = x * y


