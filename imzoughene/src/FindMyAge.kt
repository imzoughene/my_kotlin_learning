import java.util.*

fun main(args:Array<String>){

    //input
    println("Enter you day of birth")
    var dob:Int= readLine()!!.toInt()

    //process
    //var age = 2018 - dob
    var year = Calendar.getInstance().get(Calendar.YEAR);
    var age = year - dob

    //output
    println("your age is $age years")
}