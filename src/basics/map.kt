package basics

fun main(args: Array<String>) {

    val list = (1..100).toList()

    val double = list.map { it * 2 }

    val average = list.average()
    val shifted = list.map { it - average }

    println(double)
    println(shifted)

    // flat map

    val nestedList = listOf(
            (1..10).toList(),
            (11..20).toList(),
            (21..30).toList()
    )

    val notFlattened = nestedList.map { it.sortedDescending() }

    println(notFlattened)

    val flattened = nestedList.flatMap { it.sortedDescending() }

    println(flattened)


}