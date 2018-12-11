# _Discovery and analysis of Kotlin_

- _Yudi Tao_[#100600773]
- _yudi.tao@uoit.net_

## About the language

_Kotlin is a programming language that bulids base on __Java__ and run on __Java Virtual machine__. It using a similar syntax with __Java___

- Kotlin was first be invented by __JetBrains__ in 2011, which is aiming at Android developing and website programming. In 2017 Google has announced their first-class supprot language on Android is Kotlin  
- There is one thing that is interesting, Kotlin could also be interpt as a __script__, a file name end with extention __.kts __could be directly interpt by its complier. With simple language syntax, Kotlin could be easily getting start with. Another thing that is interesting is that Kotlin can preform __operator overloading__ in a similar way as C++.


## syntax

__print statement__

Simply using __``print()``__ and __``println()``__

```
println("Hello ")
print("world")
```
__declare variable in a particular type__

Use the key word __```var```__

```
var a:Double
a=5.0 
```
__const value__
```
val PI = 3.14
```
__variable can be implied declare by value__
```
var b = 1.0
```
__type casting__

Using __`a.toInt()`__ means convert __`a`__ into a Integer 

```
var c = a.toInt()

var d:Int = b.toInt()
```

__Any type__

There exist a type of value simply called __``any``__ means any one of types could be decare 

```
var some:Any = 1.0
```
__type check__

Similar with Python key word __``is``__, Kotlin have the similar usage. 

```
println(some is Int)
```
__arbitrary expression in template__

Present by __``$``__ sign in string.

```
println("Max of $a and $b: " + maxOf(a,b))
```
__arbitrary expression using function__

Function can also be arbitrary using __``${}``__.
```
println("Does $some is a Double? ${some is Double}")
println("describe $a: ${describe(a)}")
println("describe $b: ${describe(d)}")
println("describe 10: ${describe(10)}")
```

__function can be define in function__
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

__single type list__

Kotlin does not have keyword __<s>new</s>__.

Creating a list, Array, would just use __``listOf<type>() arrayOf<type>() ``__

```
var list = listOf<Int>(1,2,4,6)
```
__mix type list__

List can be creating multiple different types.

```
var list2 = listOf("abc",1,"14",2.5)
```

__loop__

- for loop iteration in range 1 - 10: __``1..10``__
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

- size of a list
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

__check if contains__

Using kerword __``in``__

```
println("\nprint directly: $list")
println("does 12 contain in $list? ${12 in list}")
```
__class delceration__

- __var__ ``foo:[Type] = constructor()``
- ``foo.fun(), foo.a`` to use class member function and variable

```
var cir:Circle = Circle("circle",2.5)
println("${cir.name}'s Area: ${cir.Area()}")
```

__packages__

import a package with __``as``__
```
import Polite.introduction as polite
import Rude.introduction as rude
```
to use packages
```
polite("Tom")
rude("Jude")
```


## About the tools
__Kotlinc:__
```
$ kotlinc hello.kt -include-runtime -d hello.jar
```
__Kotlin:__

Complie __.kt__ file into __.jar__ file. 

```
$ kotlin -classpath hello.jar HelloKt
```
- __or__

```
$ java -jar hello.jar
```

## About the standard library
- List
```
var list = listOf(1,2,13,4,15,16,62,6,37,1)
```
    - list could be directly print by __``print()``__ and __``println()``__ 
    - indexing
    ```
    println("Second of list: $list: ${list[1]}")
    ```
- Array
```
var array = arrayOf(1,2,34,2,5,25,25,26,4)
```
- ArrayList
```
 var arrayList:ArrayList<Int> = arrayListOf(1,23,1,1,5,16,19,12,41,30,10)
```
    - Add into ArrayList
        - append
    ```
    arrayList.add(13)
    ```
        - add by indexing 
    ```
    arrayList.add(4,10)
    ```
    - ArrayList could be directly print by __``print()``__ and __``println()``__ 
    - indexing
    ```
    println("Second of arrayList: $arrayList: ${arrayList[1]}")
    ```


- HashMap
```
var map = mutableMapOf<String,Int>()
```
    - add into Mutable Map 
    ```
    map.put("one",1)
    map.put("three",3)
    map.put("five",5)
    map.put("two",2)
    map.put("four",4)
    ``` 
## About open source library

> _Describe at least one contribution by the open source
community written in the language._

# Analysis of the language

> _Organize your report according to the project description
document_.


