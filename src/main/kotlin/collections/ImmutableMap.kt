fun main() {

    var immutableMap = mapOf("a" to 1 , "b" to 10)
    // Adding element in Immutable map
    immutableMap+="c" to 1
    println(immutableMap)

    // Removing element in Immutable map
    immutableMap-="a"
    println(immutableMap)

    // Updating element in Immutable Map
    val mutableMap = immutableMap.toMutableMap()
    mutableMap.put("c" , 100)
    val updatedMap = mutableMap.toMap()
    println(updatedMap)


    // Copying in Immutable Map
    val immutableCopy = immutableMap.toMap()
    println(immutableCopy)



}