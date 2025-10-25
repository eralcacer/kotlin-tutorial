fun sayItems(itemsL: Array<String>) {
    for (item in itemsL) {
        println(item)
    }
}

fun sayHello(greeting: String, itemsToGreet: List<String>) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting, $itemToGreet!")
    }
}

fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    println(interestingThings.size)
    println(interestingThings[1])
    println(interestingThings.get(0))
    sayItems(interestingThings)
    println(interestingThings.reversed())

    // Invoke forEach method with lambda expression
    interestingThings.forEach { item -> println(item) }
    interestingThings.reversed().forEach { interestThing: String -> println(interestThing) }

    // Invoke forEach to get the index and values from the array
    interestingThings.forEachIndexed { index: Int, item: String -> println("Item at index $index is $item") }

    val interestingThingsList = listOf("Kotlin", "Programming", "Comic Books")
    val mutableInterestingThingsList = mutableListOf("Kotlin", "Programming", "Comic Books")
    mutableInterestingThingsList.forEach { item -> println(item) }
    mutableInterestingThingsList.add("Games")
    mutableInterestingThingsList.reverse()
    mutableInterestingThingsList.forEach { item -> println(item) }

    // Create a graph map that maps keys to values
    val map = mapOf(1 to "a", 2 to "b", 3 to "c") 
    map.forEach { key, value -> println("Key: $key maps to Value: $value") }

    val mapStringKeys = mutableMapOf("name" to "John", "age" to "30")
    mapStringKeys["city"] = "New York"
    mapStringKeys.put("country", "USA")
    mapStringKeys.forEach { key, value -> println("Key: $key maps to Value: $value") }
    sayHello(greeting="Hello", interestingThingsList)
}