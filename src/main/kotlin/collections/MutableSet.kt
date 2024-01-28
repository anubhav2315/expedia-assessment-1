fun main() {
    val mutableSet = mutableSetOf(10, 20, 30)


    // Add operation
    mutableSet.add(40)
    println(mutableSet)

    // remove operation
    mutableSet.remove(20)
    println(mutableSet)

    // Update operation
    // Remove the old value and add the new one
    mutableSet.remove(10)
    mutableSet += 20
    println(mutableSet)


    // Copy operation in Mutable Set
    val mutableSetCopy = mutableSet.toSet()
    println(mutableSetCopy)


}