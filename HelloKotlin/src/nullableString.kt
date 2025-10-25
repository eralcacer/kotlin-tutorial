val name: String? = "Nate"
var greeting: String? = "Hello"

val nonTypableName = "Enrique"
var nonTypableGreeting = "Hi"

fun main () {
    println(greeting)
    println(name)

    greeting = null
    println(greeting)
    println(name)

    if (greeting != null) {
        println(greeting)
    } else {
        println("Greetings!")
    }

    println(nonTypableName)
    println(nonTypableGreeting)

    // Similar to switch statement in Java
    when (greeting) {
        null -> println("No greeting available")
        else -> println(greeting) // Default case
    }
    // Use if statement to assign a local variable
    greeting = "Hello, Kotlin!"
    var greetingToPrint = if (greeting != null) greeting else "Hello there!"
    println(greetingToPrint)

    greeting = null
    greetingToPrint = when(greeting) {
        null -> "Hi there!"
        else -> greeting
    }
    println(greetingToPrint)
}