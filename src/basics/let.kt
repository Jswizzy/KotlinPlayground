package basics

import java.io.File

fun main(args: Array<String>) {

    File("example.txt").bufferedReader().let {
        if (it.ready()) {
            println(it.readLine())
        }
    }

    val str: String? = "Kotlin for Android"
    str?.let {
        if (str.isNotEmpty()) {
            str.toLowerCase()
        }
    }
}