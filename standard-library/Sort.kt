fun main(){
    var list = listOf(1,2,13,4,15,16,62,6,37,1)
    var array = arrayOf(1,2,34,2,5,25,25,26,4)
    var arrayList:ArrayList<Int> = arrayListOf(1,23,1,1,5,16,19,12,41,30,10)
    var map = mutableMapOf<String,Int>()

    map.put("one",1)
    map.put("three",3)
    map.put("five",5)
    map.put("two",2)
    map.put("four",4)

    arrayList.add(13)
    arrayList.add(4,10)
    println("Second of list: $list: ${list[1]}")
    println("Second of array: ${array.toList()}: ${array.get(1)}")
    println("Second of arrayList: $arrayList: ${arrayList[1]}")
    println("Value of \"two\" in map: $map: ${map.get("two")}")



    println("Sort list $list: \n${list.sorted()}")
    println("Sort array ${array.toList()}: \n${array.sorted()}")
    println("Sort arrayList $arrayList: \n${arrayList.sorted()}")

    //normal sort on map
    println("Sort map $map in normal: \n${map.toSortedMap()}")

    //sort by values
    println("Sort map $map by values: \n${map.toList().sortedBy { (key,value) -> value }.toMap()}")

    println(map.toList())
}