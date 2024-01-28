package org.example

// Question 1

class VariableAssignment {

    fun assignPrice() {
        var price : Double =  19.99
        price = 29.99
        println(price)
    }

}


fun main() {
    val variableAssignment : VariableAssignment = VariableAssignment()
    variableAssignment.assignPrice();
}