package basics

import java.io.FileReader

fun main(args: Array<String>) {

    FileReader("mayexist.txt").use {
        println(it.readText())
    }
}