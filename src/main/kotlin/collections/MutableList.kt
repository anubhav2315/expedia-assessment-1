fun main() {

    // Creation of Mutable List
    val intMutableList = mutableListOf(1, 2, 3)
    println("Before Adding elements")
    println(intMutableList)
    intMutableList.add(4)
    intMutableList.add(5)
    intMutableList += 7
    println("After adding elements ")
    println(intMutableList)

    // Removing an element from the Mutable list at given location
    intMutableList.removeAt(2)

    // Removing an element from the Mutable List with Given value
    intMutableList.remove(7)

    println(intMutableList)

    // Updating the element at 0th Index
    intMutableList.set(0 , 10)

    println(intMutableList)

    val list = mutableListOf("a", "b", "c")
    val list2 = ArrayList(list)
    println("Copied List of $list2")






}



fun add(element : Int) {

}