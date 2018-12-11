import java.lang.NumberFormatException
import kotlin.math.pow

//main function
fun main(args:Array<String>) {
    //print statement
    println("Hello ")
    print("world")

    //declare variable in a particular type
    var a:Double
    a=5.0
    // implied declare variable by type
    var b = 1.0

    //type casting
    var c = a.toInt()

    var d:Int = b.toInt()

    //arbitrary expression in template
    println("Max of $a and $b: "+maxOf(a,b))
    println("Which one is large $a and $b? "+largerOne(a,b))
    println("Sum of $c and $d: "+sum(c,d))
    avg(c,d)
    //const value
    val PI = 3.14

    var x = 0
    //function can be define in function
    fun incrementX() {
        x += 1
    }
    incrementX()
    //space out side quote  will not affect the program running
    println("X is       now: "         +     x     +" and here is $PI"     )


    //generic type
    var some:Any = 1.0

    //type check
    println(some is Int)
    //arbitrary expression using function
    println("Does $some is a Double? ${some is Double}")

    println("describe $a: ${describe(a)}")
    println("describe $b: ${describe(d)}")
    println("describe 10: ${describe(10)}")

    //single type list
    var list = listOf<Int>(1,2,4,6)
    //mix type list
    var list2 = listOf("abc",1,"14",2.5)

    print("in list: ")
    //for loop
    for (l in list){
        print("$l ")
    }
    println()
    print("in list2: ")
    //while loop
    var i=0
    //size of a list
    while (i<list2.size){
        //indexing
        print("${list2[i]} ")
        //inc
        i++
    }


    println("\nprint directly: $list")
    //check if contains
    println("does 12 contain in $list? ${12 in list}")

    var cir:circle = circle("circle",2.5)

    println("${cir.name}'s Area: ${cir.Area()}")


    print("Input a number: ")
    //input by user

    // use !! for Null-safe input i.e. non-null assertion
    var input = readLine()!!

    println("Your input: $input")
    var word ="Word"
    //try block
    try {
        word.toInt()
    }catch (e: NumberFormatException){
       System.err.println("Unsupported Type casting.")
    }



}

//basic function with return type
fun sum(a:Int ,b:Int):Int{
    return a+b
}
fun avg(a:Int,b: Int){
    println("The average of $a and $b is ${(a+b)/2}")
}

//if statement
fun maxOf(a:Double,b:Double):Double{
    if(a<b){
        return b
    }else if(a==b){
        return 0.0
    }
    return a
}

//simple return function
fun largerOne(a:Double,b:Double) = if(a>b) a else b

//when statement
fun describe(obj:Any):String=
    when (obj) {
        is Double -> "is Double"
        1 -> "equal one"
        else -> "Unknown"
    }


//classes of Kotlin

//open: explicit modifiers for overridable members
open class Shapes(name:String){
    public var name:String="Shape"
    private var edges:Int = 0
    protected var id:Int=0
    init {
        println("Initialize a shape.")
    }
}

class circle(name:String,radius:Double):Shapes(name){
    private var radius:Double=0.0;
    init {
        this.name=name;
        this.radius=radius;
        println("Initialized: $name")
    }
    public fun Area():Double{
        //power of 2 times PI
        return radius.pow(2)*3.14
    }
}