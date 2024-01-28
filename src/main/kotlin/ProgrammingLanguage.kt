fun main() {
    var programmingLanguages : ArrayList<String> = arrayListOf("Java"  , "scala" , "NodeJs")
    // Printing list before update
    programmingLanguages.print()
    programmingLanguages.remove("scala")

    // Printing after list is updated
    programmingLanguages.add("Kotlin")
    programmingLanguages.print()
}



fun List<String>.remove(element : String) : String {
    if(this.isEmpty()) {
       return "List is already empty"
    }
    else {
        return this.remove(element)
    }

}

fun List<String>.add(element : String) : String {
    return this.add(element)
}

fun List<String>.print() {
   this.forEach{p-> print(p +"\t")}
   println()
}