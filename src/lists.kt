fun main(){
    println(evenIndex(listOf("Sarah","Sindeti","Nashivai","Juliet","Shadya","Kotlin","Python","Daniel","Moses","AkiraChix")))

    println(avgTotal(listOf(20.00,40.02,30.00,60.00,30.00,50.05)))

    var personObject= mutableListOf<PersonObject>(
        PersonObject("Sarah",19,47.4),
        PersonObject("Juliet",20,60.00),
        PersonObject("Constant",19,20.00),
        PersonObject("Shadya",21,50.00)

    )
    var sortedPersonAge=personObject.sortedByDescending { personObject -> personObject.age }
    println(sortedPersonAge)





  var new= addObjects(mutableListOf(

       PersonObject("SaraI",19,20.00),
       PersonObject("Sindeti",20,40.00)
   ))
   var final= personObject.plus(new)
    println(final)


    println(avgMileage(listOf(
        Car("KCB 123",20),
        Car("KAD 345",30),
        Car("KAF",90)
    )))





}
fun evenIndex(str:List<String>):List<String>{

    return str.filterIndexed {index, word ->index%2==0}

}
data class AvgTotal(var average:Double,var total:Double)

fun avgTotal(height:List<Double>):AvgTotal{
    var totalHeight=height.sum()
    var averageHeight=height.average()

    var avgTotal=AvgTotal(averageHeight,totalHeight)
    return avgTotal
}
data class PersonObject(var name:String,var age:Int,var weight:Double)

fun addObjects(personObject: MutableList<PersonObject>):MutableList<PersonObject>{
    return personObject


}

data class Car(var regisration:String,var mileage:Int)

fun avgMileage(car: List<Car>):Double{
    var mileage=car.sumBy { car -> car.mileage}
    return mileage/car.count().toDouble()
}