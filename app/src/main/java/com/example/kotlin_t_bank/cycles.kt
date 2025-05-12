package com.example.kotlin_t_bank

fun main() {
//    println(learnWhen(5))        // Маленькое число
//    println(learnWhen(105))      // Число вне диапазона
//    println(learnWhen("admin"))  // Привет, админ!
//    println(learnWhen("Анна"))   // Имя начинается с А
//    println(learnWhen(null))     // Значение отсутствует
//    println(learnWhen(42.0))     // Что-то другое
    cycles()
}

fun learnWhen(x: Any?): String {
    return when (x) {
        null -> "Значение отсутствует"
        is Int -> {
            when {
                x in 1..10 -> "Маленькое число"
                x !in 1..10 -> "Число вне диапазона"
                else -> "Число вне диапазона"
            }
        }

        is String -> {
            when {
                x == "admin" -> "Привет, админ!"
                x.startsWith("A") -> "Имя начинается с А"
                else -> "Обычная строка"
            }
        }

        else -> "Что-то другое"
    }
}

fun cycles() {
    for (i in 1..10) {
        if (i != 5) {
            println(i)
        }
    }
    println("-------------")
    var result = 0;
    for (i in 0 until 20) {
        result += i;
    }
    println(result)
    println("-------------")
    for (i in 10 downTo 1){
        println(i)
    }
    var sum = 0;
    var input: Int;
    do {
        println("Считается сумма пока не введете 0")
         input = readLine()!!.toInt()
        sum += input
    }while (input !== 0)
    println("Ваша сумма $sum")
}
