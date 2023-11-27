fun main(args: Array<String>){
    val a=10
    val b=5
    val c=15
    val flag = false
    var result: Boolean
    result = (a>b) && (a>c)
    println("(a>b) && (a>c) :"+ result)
    result = (a>b) || (a>c)
    println("(a>b) || (a>c) :"+ result)
    result = !flag
    println("!flag :"+ result)

}