package classtest

class Car(val make : String , val model : String , val year : Int) {


    fun print() {
        println("Car Details")
        println("Make : $make \t Model : $model \t Year : $year")
    }
}