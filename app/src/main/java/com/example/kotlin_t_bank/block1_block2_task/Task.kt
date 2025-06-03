package com.example.kotlin_t_bank.block1_block2_task


fun main() {
    println("Введите ваше имя:")
    val name: String = readLine() ?: "Guest"

    println("Введите ваш возраст")
    val ageInput = readLine()
    val age: Int = ageInput?.toIntOrNull() ?: 0

    println("Введите ваш рост в 'м'")
    val heightInput = readLine()
    val height: Double = heightInput?.toDoubleOrNull() ?: 0.0

    println("Введите ваш вес в кг")
    val weightInput = readLine()
    val weight: Double = weightInput?.toDoubleOrNull() ?: 0.0

    println("Введите ваше любимое число целое или с точкой")
    val favouriteInput = readLine()
    val favourite: Number
    if (favouriteInput?.toIntOrNull() != null) {
        favourite = favouriteInput.toInt()
    } else {
        favourite = favouriteInput?.toDoubleOrNull() ?: 0.0
    }

    println("Введите ваш любимый символ")
    val favouriteCharInput = readLine()
    val favouriteChar: Char = if(favouriteCharInput.isNullOrEmpty()) ' ' else favouriteCharInput[0]

    print("Умеешь ли ты программировать на Kotlin? (true/false): ")
    val isKnowKotlin = readLine()?.toBooleanStrictOrNull() ?: false
}