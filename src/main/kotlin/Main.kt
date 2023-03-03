
fun main() {

    createArray("House","Henriet","Home","Becky")
    city()
    getArray()
    println(names("Uganda","Rwanda","Kenya"))


}
//Create a function that takes in 4 strings and creates an array out of them then
//            prints out the array
fun createArray(num1:String, num2:String, num3:String,num4:String){
    var createArray = arrayOf(num1,num2,num3,num4)
    println(createArray.contentToString())
}
//   2. Create a function that given an array below:
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case. (2 points)
fun city(){
    var cities = arrayOf("harare","mumbai","dodoma","jarkata")
    println(cities.map { it.capitalize() })
}

//    Create one function that given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order

fun getArray(){
    var num = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    println(num[1]+num[4])
    println(num.indexOf(158))
    println(num.sortedArray().contentToString())

}
//Create a function that takes in 3 names and returns a string array containing
//all 3 names.

fun names(name1:String, name2:String, name3:String):String{
    var name = arrayOf(name1,name2,name3)
    return name.contentToString()
}
