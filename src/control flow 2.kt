import javax.xml.stream.events.Characters

fun main() {
println(IsEven(2))
    print(names("Orange"))
}
fun IsEven(numbers:Int):Boolean {
    if (numbers % 2 == 0) {
        return true
    } else if (numbers % 3 == 0) {
        return false
    } else {
        return false
    }
}

fun names(name:String):String{
    var x=" "
    for (i in name){
        if(name.indexOf(i)%2==0){
            print(i)
        }
    }
    return "${x}"
}



