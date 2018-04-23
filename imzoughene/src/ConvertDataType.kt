fun main(args:Array<String>){
    var n1:Int=10
    var n2:Int?
    var n3Str:String = "20"
    n2 = n3Str.toInt()
    println("n1 : "+n1)
    println("n2 : "+n2)
    var n4:Float?
    n4 = n3Str.toFloat()
    println("n4 : "+n4)

    var xpi:Double=3.14
    println("xpi : "+xpi)
    var intPi:Int = xpi.toInt()
    println("intPi : "+intPi)
}