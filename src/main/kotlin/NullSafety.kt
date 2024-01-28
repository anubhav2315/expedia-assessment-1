package org.example
fun main() {
    var s1 : String = "Anubhav"
    //s1 = null; Not Allowed
    println(s1.length)
    var s2 : String? = "Anubhav"
    s2 = null
    println(s2?.length) // This statement will not throw null pointer Exception
}