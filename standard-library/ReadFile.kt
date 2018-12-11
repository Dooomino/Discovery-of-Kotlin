import java.io.File
import java.io.FileNotFoundException

fun main(){
    var filename = "file.txt"
    try {
        println("For each line:")
        readForEachLine(filename)
        var list1=readByBufferedReader(filename)
        var list2=readByReadLines(filename)
        println("\nBuffer reader: ")
        for (i in list1)
            println(i)
        println("\nRead lines: ")
        for (i in list2)
            println(i)

        var file2 = "Write.txt"
        File(file2).writeText("1")
        File(file2).printWriter().use { out -> out.println("2") }
        File(file2).bufferedWriter().use { out -> out.write("3") }
        File(file2).appendText("Append.")

    }catch (e: FileNotFoundException){
        System.err.println("File not found.")
    }
}

fun readForEachLine(fileName: String)
        = File(fileName).forEachLine{println(it)}
fun readByBufferedReader(fileName: String): List<String>
        = File(fileName).bufferedReader().readLines()
fun readByReadLines(fileName: String): List<String>
        = File(fileName).readLines()