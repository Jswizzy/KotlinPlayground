package basics


fun main(args: Array<String>) {

    val possiblePrimesAfter2 = generateSequence(3) { it + 2 }


    val primes =
            generateSequence(2 to possiblePrimesAfter2) {

                // next prime
                val p = it.second.first()

                // filter out all elements div by p
                val possiblePrimesAfterP = it.second.filter { it % p != 0 }

                // return next element in the sequence
                p to possiblePrimesAfterP
            }.map { it.first }

    println(primes.take(10).toList())
}