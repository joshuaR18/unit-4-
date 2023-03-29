fun main() {
    println("Enter a positive nonzero integer value:")
    val n = readLine()?.toIntOrNull()

    if (n != null && n > 0) {
        var sum = 0
        for (i in 1..n) {
            sum += i
        }
        println("The sum of all integers from 1 up to $n is $sum.")
    } else {
        println("Invalid input.")
    }
}
