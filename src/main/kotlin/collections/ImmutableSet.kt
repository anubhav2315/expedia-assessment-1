fun main() {

    var immutableSet = setOf(10, 15, 20)
    // Add operation in Immutable set
    immutableSet+=25
    println(immutableSet)

    // remove operation in Immutable set
    immutableSet-=20
    println(immutableSet)

    // update operation in Immutable set
    val immutable =  immutableSet.map { if (it == 10) 100 else it}.toMutableSet()
    println(immutable)

    // Copy Operation in Immutable Set
    val immutableSetCopy = immutableSet.toMutableSet()
    println(immutableSetCopy)

}