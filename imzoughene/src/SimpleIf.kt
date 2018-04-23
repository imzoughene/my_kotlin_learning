fun main(args:Array<String>){
    println("Enter your Grade")
    var grade = readLine()!!.toFloat()
    if(grade>=90){
        //block of code
        if(grade<93){
            //Nested If
            println("you are in A- level")
            grade+=3
        }else{
            println("you are in A+ level")
            grade+=1
        }

    }else{
        println("You are not in A level")
    }
    if(grade>=50 && grade<=70){
        grade+=10
        println("you get extra 10 point")
    }
    println("your grade is : $grade")
}