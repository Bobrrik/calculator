fun main(args: Array<String>) {
    calculator()
}

fun calculator() {
    println("Введите выражение")
    val text = readln().trim().split(" ")
    val number_1 = text[0].toInt()
    val arithmetical = text[1]
    val number_2 = text[2].toInt()
    var answer = 0

    when (arithmetical) {
        "-" -> answer = number_1 - number_2
        "+" -> answer = number_1 + number_2
        "*" -> answer = number_1 * number_2
        "/" -> answer = number_1 / number_2
        else -> {
            println("ещё разок")
            calculator()
        }
    }

    println("Результат: $number_1 $arithmetical $number_2 = $answer")
}
