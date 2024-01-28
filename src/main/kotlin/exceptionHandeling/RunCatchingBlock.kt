fun main() {
    var output = runCatching { divide(25 , 0) }
    if(output.isSuccess) {
        println("Output of this : ${output.getOrNull()}")
    }
    else {
        println("Error : ${output.exceptionOrNull()?.message}")
    }
}

fun divide(num : Int , denominator : Int) : Int {
    if(denominator ==0) {
        throw IllegalArgumentException("Please Enter a number other than 0")
    }
    return num/denominator
}