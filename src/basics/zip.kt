package basics

fun main(args: Array<String>) {

    val list = listOf("Hi", "there", "Kotlin", "fans")
    val containsT = listOf(false, true, true, false)


    val zipped = list.zip(containsT)

    println(zipped)

    val mapping = list.zip(list.map { it.contains("t") })

    println(mapping)



}