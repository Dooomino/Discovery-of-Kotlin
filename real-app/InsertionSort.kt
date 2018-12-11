
fun main() {
    val arr:ArrayList<Int> = arrayListOf(1, 3, 5, 4, 2, 6, 10, 13, 15, 17, 16, 14, 12, 19, 18, 11)
    insertionSort(arr)
    println("Sorted list:\n$arr")
}

fun insertionSort(arr: ArrayList<Int>) {
    for (j in 1..arr.size - 1){
        var i = j - 1
        val value = arr[j]
        while ( (i >= 0) && (arr[i] > value) ){
            println("Let arr[${i + 1}] = arr[$i].")
            arr[i + 1] = arr[i]
            i--
        }
        arr[i + 1] = value
    }
}
