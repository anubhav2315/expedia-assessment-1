fun main() {

    val mutableMap = mutableMapOf("a" to 1, "b" to 2)
    println(mutableMap)

    // Adding key value pair in Mutable Map
    mutableMap.put("c" , 3)
    println(mutableMap)
    mutableMap["d"] = 4
    println(mutableMap)

    // removing Key Value Pair
    mutableMap.remove("a")
    println(mutableMap)

    // Update Value of a Key
    mutableMap.put("b" , 10)
    mutableMap["b"] = 20
    println(mutableMap)


    // Copy value of Map
    val mutableMapCopy =  mutableMap.toMutableMap()
    println(mutableMapCopy)




}