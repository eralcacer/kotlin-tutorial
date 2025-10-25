
fun sayHello(greeting: String, vararg itemsToGreet: String) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting, $itemToGreet!")
    }
}

fun greetPerson(greeting: String, name: String) = println("$greeting $name!")

fun greetPersonDefault(greeting: String = "Hello", name: String = "Guest") =
    println("$greeting, $name!")

fun main() {
    val interestingThings = listOf("Alice", "Bob", "Charlie")
    val greetingItemsList = arrayOf("Diana", "Eve", "Frank")
    sayHello("Welcome", *greetingItemsList)
    sayHello("Greetings", "George", "Hannah", "Ian")
    sayHello("Hello")
    sayHello("Hi", *interestingThings.toTypedArray())
    greetPerson(name = "Jack", greeting = "Good evening")

    // Default arguments values
    greetPersonDefault()
    sayHello(greeting = "Salutations", itemsToGreet = *greetingItemsList)
    sayHello(itemsToGreet = *greetingItemsList, greeting = "Howdy")
}