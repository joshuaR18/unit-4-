import kotlin.random.Random

fun main() {
    val numberToGuess = Random.nextInt(1, 101) // generates a random number between 1 and 100
    var userGuess: Int
    do {
        print("Guess the number between 1 and 100: ")
        userGuess = readLine()?.toIntOrNull() ?: 0 // reads the user's input and converts it to an integer
        if (userGuess > numberToGuess) {
            println("Too high, try again.")
        } else if (userGuess < numberToGuess) {
            println("Too low, try again.")
        }
    } while (userGuess != numberToGuess)
    println("Congratulations, you guessed the number!")
}
