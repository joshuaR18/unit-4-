import kotlin.random.Random

fun main() {
    val numberToGuess = Random.nextInt(1, 101) 
    var userGuess: Int
    do {
        print("Guess the number between 1 and 100: ")
        userGuess = readLine()?.toIntOrNull() ?: 0 
        if (userGuess > numberToGuess) {
            println("Too high, try again.")
        } else if (userGuess < numberToGuess) {
            println("Too low, try again.")
        }
    } while (userGuess != numberToGuess)
    println("Congratulations, you guessed the number!")
}
