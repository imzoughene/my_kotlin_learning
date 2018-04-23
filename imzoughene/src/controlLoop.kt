fun main(args:Array<String>){
    loop@ for(count in 1..20){
        if(count%2!=0)
            continue
        println("count : $count")
        if(count>15)
            break
        for(x in 0..5){
            if(x==3){
                break@loop
            }
        }
    }
}