// Top level variables in Kotlin
val topLevelName: String = "Mary"
var topLevelGreeting: String = "Hello"

fun main() {
    // Immutable variable of type string
    val name: String = "Peter"
    // Mutable variable of type string
    var mutableName: String = "John"

    println("Immutable name: $name")
    println("Mutable name before change: $mutableName")
    println(topLevelGreeting)
    println(topLevelName)
    topLevelGreeting = "Hi"
    println(topLevelGreeting)
}