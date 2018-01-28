package basics

fun main(args: Array<String>) {
    val together = concat(listOf("Kotlin", "Android", "Scala"), " : ")
    println(together)
}

fun concat(texts: List<String>, separator: String = ", ") = texts.joinToString(separator)