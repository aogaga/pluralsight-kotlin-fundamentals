import com.rsk.Person

fun main(args: Array<String>): Unit{
    println("Hello, World")
    val kevin = Person("Kavin")

    println("Name is ${kevin.Name}")

    kevin.Name = "Steve"
    println("Name is ${kevin.Name}")

    kevin.display()

    //print with lambda
    kevin.displayWithLambda(::printName)
}


fun printName(name: String): Unit{
    println(name)
}