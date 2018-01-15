fun Int.isPar(): Boolean {
    return this % 2 == 0
}

fun Int.isPositive(): Boolean {
    return this >= 0
}

fun Int.multiply(number: Int): Int {
    return this * number
}

fun main(args: Array<String>) {
	var number1: Int = 10
    var number2: Int = -10
    println("Es positivo: " + number1.isPositive())
    println("$number1 ¿es par?: " + number1.isPar())
    println("Es positivo: " + number2.isPositive())
    println("Multiply: " + number1.multiply(10))
}