package basics

fun main(args: Array<String>) {

    val veryLongList = (1..999999L).toList()

    val sum = veryLongList
            .asSequence()
            .filter { it > 50 }
            .map { it * 2 }
            .take(1000)
            .sum()

    println(sum)

    val sequence = generateSequence(1) { it + 1 }

    println(sequence.take(10).toList())

}