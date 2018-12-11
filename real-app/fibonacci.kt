fun main(){
    for(i in 1..10){
        println("Fibonacci number of $i th: ${fib(i)})")
    }
}


fun fib(n:Int):Int{
    if(n<=2){
        return 1
    }
    return fib(n-1)+fib(n-2)
}