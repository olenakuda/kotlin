fun main() {

    infix fun Int.times(str: String) = str.repeat(this)        // 1
    println(2 times "Bye ")                                    // 2

    val pair = "Ferrari" to "Katrina" to "Someone" to "Lala"    // 3
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)   // 4
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    val olena = Person("Olena")
    sophia likes claudia                                       // 5
    sophia likes olena                                       // 5
    val likedPerson = sophia.likedPeople[0]
    println(likedPerson.name)
    println(sophia.likedPeople[1].name)

    println(startSimple())
    println(start())
    println(start("Super OK"))
    println(start())


    printAll("Hello", "Hallo", "Salut", "Hola", "你好")

    printAllWithPrefix("Elena", "Elena", "Veronika", "Anastasiia", "KOEl", prefix ="Hola ")

    log("Hello", "Hallo", "Salut", "Hola", "你好")

    //String templates
    val price = """${'$'}9.99 """
    println(price)

    println( """
    |Tell me and I forget.
    |Teach me and I remember.
 |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    )

    println( """
    @Tell me and I forget.
    @Teach me and I remember.
 @Involve me and I learn.
    @(Benjamin Franklin)
    """.trimMargin("@")
    )


}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }  // 6
}

fun startSimple(): String = "Simple OK"

fun start(word : String = "Default OK"): String {
    return word
}
fun start(): String = "Not Default OK"

fun printAll(vararg messages: String) {                            // 1
    for (message in messages) println(message)
}

fun printAllWithPrefix( vararg messages : String, prefix : String){
    for (message in messages) println(prefix + message)
}

fun log(vararg messages : String){
    printAll(*messages)
}
