fun main(args:Array<String>){
    println("enter you favorite language")
    var language = readLine()
    println("------------------")
    println("your answer is "+language)
    println("------------------")
    println("enter you birth's year")
    var birth_year:Int= readLine()!!.toInt()
    println("your age is "+(2018-birth_year))
    println("------------------")
    println("enter you salary as trainee developer")
    var salary:Double= readLine()!!.toDouble()
    println("your answer is "+salary)



}