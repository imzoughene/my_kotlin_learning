fun main(args:Array<String>){
    println("enter a color number")
    var x:Int= readLine()!!.toInt()
    when(x){
        1-> print("your color is red")
        2->{
            println("your color is yellow")
        }
        3,5->{
            println("your color is orange")
        }
        in 10..30->{
            println("your color is gray")
        }
        else->{
            println("you are out of the range")
        }
    }
}