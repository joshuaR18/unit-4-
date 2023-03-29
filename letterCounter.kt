fun main() {
    println("Enter a string:")
    val str = readLine()?.trim()

    if (!str.isNullOrEmpty()) {
        println("Enter a character:")
        val char = readLine()?.trim()?.getOrNull(0)

        if (char != null) {
            val count = str.count { it == char }
            println("The character '$char' appears $count time(s) in the string '$str'.")
        } else {
            println("Invalid input.")
        }
    } else {
        println("Invalid input.")
    }
}
