fun main() {
    // Creating an Immutable list in kotlin
    val immutableList: List<String> = listOf("This", "Is", "Totally", "Immutable")
    // Addition of new element
    val newList = immutableList + "New Element"
    println(newList)

    // Immutable lists don't support removal, but you can filter out elements

    val filteredList = immutableList.filter { element -> element != "This" }
    println(filteredList)

    // Immutable lists don't support direct updates. You can create a new list with the updated elements.
    val updatedList = immutableList.map { if (it == "This") "Replaced Element" else it }
    println(updatedList)

    // Copy Operation
    val immutableListCopy = immutableList.toList()
    println(immutableListCopy)




}