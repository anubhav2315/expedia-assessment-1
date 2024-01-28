fun main() {
    val name : String = "Anubhav"
    try {
        val convertedNum: Int = name.toInt()
    }
    catch (err: NumberFormatException) {
        println("Exception is coming due to the reason : ${err.localizedMessage}")
    }
}