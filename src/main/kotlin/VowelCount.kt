package org.example

import java.util.*

// Question 3 Task 1
fun main() {

    var str : String = "Kotlin is concise and expressive"
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    var count : Int = 0
    for(char in str.lowercase(Locale.getDefault())) {
        if (char in vowels) {
            count++
        }
    }
    println("count of the Vowel : $count")
}