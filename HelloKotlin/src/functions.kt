
fun getGreeting(): String {
    return "Hello, Kotlin!"
}

// This function returns no meaningful value
fun sayHello() {
    println(getGreeting())
}

// Single expression function
fun singleStringLiteral(): String = "Hello from single line function!"

fun sayName(name: String) = println("Hello, $name!")

fun greetingName(greeting: String, name: String) = println("$greeting, $name!")


fun main() {
    println(getGreeting())
    sayHello()
    println(singleStringLiteral())
    sayName(name = "John")
    greetingName(greeting = "Hi", name = "John")
}