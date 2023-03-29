fun main() {
    print("Enter the starting number of organisms: ")
    var population = readLine()?.toIntOrNull() ?: return
    if (population < 2) {
        println("Starting population must be at least 2.")
        return
    }

    print("Enter the average daily population increase (as a percentage): ")
    val dailyIncrease = readLine()?.toDoubleOrNull() ?: return
    if (dailyIncrease < 0) {
        println("Daily increase must be a positive number.")
        return
    }

    print("Enter the number of days they will multiply: ")
    val days = readLine()?.toIntOrNull() ?: return
    if (days < 1) {
        println("Number of days must be at least 1.")
        return
    }

    var currentPopulation = population.toDouble()
    println("Day 1: $population")
    for (day in 2..days) {
        currentPopulation *= (1 + dailyIncrease / 100)
        println("Day $day: ${currentPopulation.toInt()}")
    }
}
