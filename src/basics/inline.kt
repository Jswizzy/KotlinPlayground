package basics

fun modifyString(str: String, operation: (String) -> String): String {
    return operation(str)
}

fun main(args: Array<String>) {
    val s = modifyString("Kotlin is amazing") { it.toUpperCase() }
    
    println(s)
}