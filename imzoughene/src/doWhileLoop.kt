fun main(args:Array<String>){
    var count:Int?
    count=6
    do{
        println("count : $count")
        count++
        if(count%2==0){
            println("$count is pair")
        }
    }while(count<14)
}