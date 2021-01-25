# _Discovery and analysis of Kotlin_

- _Yudi Tao_ 
- _yudi.tao@uoit.net_

## About the language

_Kotlin is a programming language that bulids base on __Java__ and run on __Java Virtual machine__. It using a similar syntax with __Java___

- Kotlin was first be invented by __JetBrains__ in 2011, which is aiming at Android developing and website programming. In 2017 Google has announced their first-class supprot language on Android is Kotlin  
- There is one thing that is interesting, Kotlin could also be interpt as a __script__, a file name end with extention __.kts__ could be directly interpt by its complier. With simple language syntax, Kotlin could be easily getting start with. Another thing that is interesting is that Kotlin can preform __operator overloading__ in a similar way as C++.


## About Syntax

### Print Statement <hr>

Simply using __``print()``__ and __``println()``__

```
println("Hello ")
print("world")
```
### Declare Variable by Type <hr>

Use the keyword __```var```__

```
var a:Double
a=5.0 
```
### Const Value<hr>
```
val PI = 3.14
```
__variable can be implied declare by value__
```
var b = 1.0
```
### Type Casting<hr>

Using __`a.toInt()`__ means convert __`a`__ into a Integer 

```
var c = a.toInt()

var d:Int = b.toInt()
```
### "Any" Type<hr>

There exist a type of value simply called __``Any``__ means any one of types could be decare 

```
var some:Any = 1.0
```
### Type Check<hr>

Similar with Python keyword __``is``__, Kotlin have the similar usage. 

```
println(some is Int)
```
### Arbitrary Expression in Template<hr>

Present by __``$``__ sign in string.

```
println("Max of $a and $b: " + maxOf(a,b))
```
### Arbitrary Expression Using Function<hr>

Function can also be arbitrary using __``${}``__.
```
println("Does $some is a Double? ${some is Double}")
println("describe $a: ${describe(a)}")
println("describe $b: ${describe(d)}")
println("describe 10: ${describe(10)}")
```

### Function can be Define in Function<hr>
```
fun xAddOne(){
    var x = 0
    fun incrementX() {
        x += 1
    }
    incrementX()
    print(x)
}
```
- ___`x`___ is a example to use __closure__ inside ___`incrementX()`___
- space that outside quote will not affect the program running
```
println("X is       now: "         +     x     +" and here is $PI"     )
```

### Single Type List<hr>

Kotlin does not have keyword __<s>new</s>__.

Creating a list, Array, would just use __``listOf<type>() arrayOf<type>() ``__

```
var list = listOf<Int>(1,2,4,6)
```
### Mix Type List<hr>

List can be creating multiple different types.

```
var list2 = listOf("abc",1,"14",2.5)
```

### Loop<hr>

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

-  increment 
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

### Check if Contains<hr>

Using kerword __``in``__

```
println("\nprint directly: $list")
println("does 12 contain in $list? ${12 in list}")
```
### Class Delceration<hr>

- __`open`__: explicit modifiers for overridable members

- __`Shapes(name:String)`__: the main default constructor of a Class 

```
open class Shapes(name:String){
    public var name:String="Shape"
    private var edges:Int = 0
    protected var id:Int=0
    }
```
- Class initializer 
```
    init {
        println("Initialize a shape.")
    }
```
- Inheritance 
    - circle(name:String,radius:Double): __`Shapes(name)`__ 
    means inherit from super class and override the default constructor
```
//pow function was not in base of Kotlin
import Kotlin.math.pow

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
```
- To create a instance:
    - __var__ ``foo:[Type] = constructor()``
    - ``foo.fun(), foo.a`` to call class member function and variable
    ```
    var cir:Circle = Circle("circle",2.5)
    println("${cir.name}'s Area: ${cir.Area()}")
    ```

### Packages<hr>

- Import a package with __``as``__
```
import Polite.introduction as polite
import Rude.introduction as rude
```
- To use packages:
```
polite("Tom")
rude("Jude")
```
### Input from User<hr>

- Use "__`!!`__" for Null-safe input i.e. non-null assertion
```
var input = readLine()!!
println("Your input: $input")
```
- Try Block
```
var word ="Word"
try {
    word.toInt()
}catch (e: NumberFormatException){
    //Java packages still work in Kotlin, since Kotlin is bulit on Java
    //such as System.out and System.err 
   System.err.println("Unsupported Type casting.")
   }
```

### About the tools
#### Kotlinc:
Complie __.kt__ file into __.jar__ file. 
```
$ kotlinc hello.kt -include-runtime -d hello.jar
```
#### Kotlin:


```
$ kotlin -classpath hello.jar HelloKt
```
- __or__

```
$ java -jar hello.jar
```

#### Gradle

Use [Gradle Kotlin Plugin](https://kotlinlang.org/docs/reference/using-gradle.html) Kotlin project could be easy builded.

```
buildscript {
    ext.kotlin_version = '1.3.11'

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
    }
}
```


## About the standard library

### List<hr>

```
var list = listOf(1,2,13,4,15,16,62,6,37,1)
```

- list could be directly print by __``print()``__ and __``println()``__ 
    
#### indexing<hr>

```
list[1]
```

#### sorting <hr>

```
list.sorted()
```
    
### Array<hr>

```
var array = arrayOf(1,2,34,2,5,25,25,26,4)
```

- Array cannot be <s>indexing</s> and <s>print</s>,however it could transform to list by `array.toList()`
    
#### sort<hr>
    
```
array.sorted()
```
### ArrayList<hr>

```
 var arrayList:ArrayList<Int> = arrayListOf(1,23,1,1,5,16,19,12,41,30,10)
```

#### Add into ArrayList<hr>
    
- append

```
arrayList.add(13)
```
        
- add by indexing

```
arrayList.add(4,10)
```

- ArrayList could be directly print by __``print()``__ and __``println()``__ 

#### indexing<hr>

```
arrayList[1]
```

#### sorting<hr>

```
arrayList.sorted()
```

### HashMap<hr>

```
var map = mutableMapOf<String,Int>()
```

#### add into Mutable Map <hr>
    
```
map.put("one",1)
map.put("three",3)
map.put("five",5)
map.put("two",2)
map.put("four",4)
``` 
    
- mutableMap could be directly print by __``print()``__ and __``println()``__ 
   
#### get value by key <hr>

```
map.get("two")
```
#### sorting<hr>
- normal sort on map (Sort by Key)

```
map.toSortedMap()
```
- sort by values (Sort by Value)

```
map.toList().sortedBy{(key,value)->value }.toMap()
```

### File I/O
Kotlin can directly use __java.io__ for File I/O

#### Read File<hr>
- For Each Line
```
fun readForEachLine(fileName: String)
        = File(fileName).forEachLine{println(it)}
```
 - __`it`__ is the keyword as parameter that passing into a lamda function
- Read By Buffered Reader
```
fun readByBufferedReader(fileName: String): List<String>
        = File(fileName).bufferedReader().readLines()
```
- Read Lines
```     
fun readByReadLines(fileName: String): List<String>
        = File(fileName).readLines()
```
#### Write File<hr>

- Write Text
```
File("Write.txt").writeText("1")
```
- Append Text
```
File("Write.txt").appendText("Append one line.")
```
- Print Writer
```
File("Write.txt").printWriter().use{ 
    out -> out.println("2") 
    }
```
- Buffered Writer
```
File("Write.txt").bufferedWriter().use { 
    out -> out.write("3") 
    }
```

    
## About Open Source Library

### TornadoFX

[TornadoFX](https://tornadofx.io) is a library of Lightweight JavaFX Framework for Kotlin. 

Is a __GUI__ specialize library, a type safe GUI builders. 

TornadoFX could be Run on Gradle using dependecy, by [Setup](https://edvin.gitbooks.io/tornadofx-guide/part1/2.%20Setting%20Up.html) TornadoFX could be easy deployed in few lines.

TornadoFX only support up to Java 8, since Java9/10 had removed JavaFx from Java, which is one of the bases of TornadoFX. 

# Analysis of the language

After programming using Kotlin, We can say that Kotlin is a both __functional programming language__ but also a __procedural programming language__, since Kotlin has both __object-oriented__ and __functional constructs__. However, we mainly use it function programming style for most stiuations. __Functional programming is a part of Kotlin__, Java Exceptions and Libraries could be used in Kotlin as well.

Kotlin is a __statically-typed__ programming language, it has the __fix data type__ once a varibale of function is declared, although variable could be an __`Any`__ type at first, it data type cannot be changed after a value is asigned. As a high level programming language, Kotlin has simplfied many things in it inline functions such as __`toInt()`__ for type casting and __`1..10`__ for generate range function, and even could override operators. Eventhough Kotlin __does not have the ability to perform meta-programming__, it is possible to create program using keywords such as __`infix`__ to create a __meta-programming-like function__. For example:


>  
```
infix fun Double.pwr(exp: Double) = Math.pow(this, exp)
fun main() {
    val d = 2.0 pwr 8.0
    println(d)<br>
}
```

> --- <cite>https://rosettacode.org/wiki/Metaprogramming#Kotlin</cite>

When a function declared with __`infix`__, means the word __`pwr`__ would be treated as a power operator.

Kotlin provides the ability to call an instance of a function type with receiver providing the receiver object. A lambda expression in Kotlin can access its closure, such as:
```
fun xAddOne(){
    var x = 0
    fun incrementX() {
        x += 1
    }
    incrementX()
    print(x)
}
```
Where __`x`__ is also used inside and outside of __`incrementX()`__.

Kotlin has a very generic coding style, it could have multiple variants in coding functions, class and whole program, it combines different operations and syntax from other languages like C++, Java and Python. However, that may cause problemes such that if a whole program coded in a very personal style, the code could be hard to read.



