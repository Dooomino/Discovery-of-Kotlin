# _Discovery and analysis of Kotlin_

- _Yudi Tao_[#100600773]
- _yudi.tao@uoit.net_

## About the language

 _Kotlin is a programming language that bulids base on ** Java ** and run on ** Java Virtual machine **. It using a similar syntax with ** Java **_

- Kotlin was first be invented by ** JetBrains ** in 2011, which is aiming at Android developing and website programming. In 2017 Google has announced their first-class supprot language on Android is Kotlin  
- There is one thing that is interesting, Kotlin could also be interpt as a ** script **, a file name end with extention ** .kts ** could be directly interpt by its complier. With simple language syntax, Kotlin could be easily getting start with. Another thing that is interesting is that Kotlin can preform ** operator overloading ** in a similar way as C++.


## syntax

 *** print statement ***

Simply using ** ``print()`` ** and ** ``println()`` **

 ```
    println("Hello ")
    print("world")
```
*** declare variable in a particular type ***

Use the key word ** ```var``` **

```
    var a:Double
    a=5.0 
```
*** const value ***
```
    val PI = 3.14
```
*** variable can be implied declare by value ***
```
    var b = 1.0
```
*** type casting ***

Using ** `a.toInt()` ** means convert `a` into a Integer 

```
    var c = a.toInt()

    var d:Int = b.toInt()
```

*** Any type ***

There exist a type of value simply called ** ``any`` ** means any oneof types could be decare 

```
    var some:Any = 1.0
```
*** type check ***

Similar with Python key word ** ``is`` **, Kotlin have the similar usage. 

```
    println(some is Int)
```
*** arbitrary expression in template ***

Present by ** ``$`` ** sign in string.

```
    println("Max of $a and $b: " + maxOf(a,b))
```
*** arbitrary expression using function ***

Function can also be arbitrary using ** ``${}``**.
```
    println("Does $some is a Double? ${some is Double}")
    println("describe $a: ${describe(a)}")
    println("describe $b: ${describe(d)}")
    println("describe 10: ${describe(10)}")
```

*** function can be define in function ***
```
    var x = 0
    fun incrementX() {
        x += 1
    }
    incrementX()
```
 - space that outside quote will not affect the program running
```
    println("X is       now: "         +     x     +" and here is $PI"     )
```

*** single type list ***

Kotlin does not have keyword ** <s>new</s> **.

Creating a list, Array, would just use ** ``listOf<type>() arrayOf<type>() `` ** 

```
    var list = listOf<Int>(1,2,4,6)
```
*** mix type list ***

List can be creating multiple different types.

```
    var list2 = listOf("abc",1,"14",2.5)
```

*** loop ***

- for loop iteration in range 1 - 10: ** ``1..10`` **
```
    for (i in 1..10){
        print("$i ")
    }
```
- foreach 
```
    for (l in list){
        print("$l ")
    }
```

- size of a list: **``` ```**
```
    list.size
```
-  indexing
```
    print("${list2[i]} ")
```

-  inc 
```       
    i++
```
- while loop 
```
    var i=0
    while (i<list.size){
        print("${list2[i]} ")
        i++
    }
```

*** check if contains ***

Using kerword ** ``in`` ** 

```
    println("\nprint directly: $list")
    println("does 12 contain in $list? ${12 in list}")
```
*** class delceration ***

- ** var ** ``foo:[Type]`` = ``constructor``()
- ``foo.fun(), foo.a`` to use class member function and variable

```
    var cir:Circle = Circle("circle",2.5)
    println("${cir.name}'s Area: ${cir.Area()}")
```


## About the tools
*** Kotlinc: ***
```
$ kotlinc hello.kt -include-runtime -d hello.jar
```
*** Kotlin: ***

```
$ kotlin -classpath hello.jar HelloKt
```
- ** or **

```
$ java -jar hello.jar
```

## About the standard library

> _Give some examples of the functions and data structures
> offered by the standard library_.

## About open source library

> _Describe at least one contribution by the open source
community written in the language._

# Analysis of the language

> _Organize your report according to the project description
document_.


