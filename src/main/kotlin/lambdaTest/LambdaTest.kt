

fun main() {
    val list  = listOf(5 , 10 , 15 , 19 ,20 , 25 ,26, 30 ,35 ,41)
    val filteredList = list.filter { it%5 ==0 }
    println(filteredList)
}