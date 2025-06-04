package com.example.kotlin_t_bank.block1_block2_task


fun main() {
    println("Введите ваше имя:")
    val name: String = readLine() ?: "Guest"

    println("Введите ваш возраст")
    var ageInput = readLine()
    var age: Int = ageInput?.toIntOrNull() ?: 0
    while(!(age in 14..70)){
        println("Вы ввели возраст меньше 14 или 70 лет, попробуйте еще раз")
        ageInput = readLine()
        age = ageInput?.toIntOrNull() ?: 14
    }

    println("Введите ваш рост в 'м'")
    var heightInput = readLine()
    var height: Double = heightInput?.toDoubleOrNull() ?: 0.0

    while(!(height in 1.4..2.3)){
        println("Вы ввели рост меньше 1.4 или 2.3 метра, попробуйте еще раз")
        heightInput = readLine()
        height = heightInput?.toDoubleOrNull() ?: 1.4
    }

    println("Введите ваш вес в кг")
    var weightInput = readLine()
    var weight: Double = weightInput?.toDoubleOrNull() ?: 50.0

    while(!(weight in 50.0..160.0)){
        println("Вы ввели вес меньше 50 или 160 кг, попробуйте еще раз")
        weightInput = readLine()
        weight = weightInput?.toDoubleOrNull() ?: 50.0
    }

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
    val favouriteChar: Char = if (favouriteCharInput.isNullOrEmpty()) ' ' else favouriteCharInput[0]

    print("Умеешь ли ты программировать на Kotlin? (true/false): ")
    val isKnowKotlin = readLine()?.toBooleanStrictOrNull() ?: false

    val bmi: Double = if (height > 0) weight / (height * height) else 0.0
    val bmiFormatted = String.format("%.2f", bmi)

    val bmiCategory: String = when (bmi) {
        in 0.0..18.4 -> "Недостаточный вес"
        in 18.5..24.9 -> "Нормальный вес"
        in 25.0..29.9 -> "Избыточный вес"
        in 30.0..Double.MAX_VALUE -> "Ожирение"
        else -> "Некорректные данные"
    }
    val multiResult = """
        Привет, $name!
        Тебе $age лет.
        Твой BMI = $bmiFormatted
        Категория: $bmiCategory
    """.trimIndent()

    println(multiResult)

    val isAdult = age >= 18
    val bmiIsNormal = bmi in 18.5..24.9
    val youngOrNormal = (age < 30) || bmiIsNormal

    if (isAdult && bmiIsNormal && isKnowKotlin) {
        println("Отлично, $name! Ты в хорошем состоянии и уже знаком с Kotlin.")
    } else if (isAdult && bmiIsNormal) {
        println("$name, чтобы стать Middle-разработчиком, тебе ещё нужно попрактиковаться в Kotlin.")
    } else if (youngOrNormal) {
        println("$name, твоё здоровье (BMI) требует внимания, но ты совершеннолетний. Начни с заботы о себе.")
    } else {
        println("$name, ты ещё не совершеннолетний. Сосредоточься на учёбе и следи за здоровьем.")
    }

    when (favourite) {
        is Int -> {
            val diff = favourite - age
            println("Ты ввел целое число. Результат favourite - age = $diff")
        }

        is Double -> {
            val result = favourite * bmi
            val resultFormated = String.format("%.2f", result)
            println("Ты ввёл дробное число. Результат favoriteNumber * BMI = $resultFormated")
        }

        else -> {
            println("Не удалось определить тип любимого числа.")
        }
    }

    when (favouriteChar) {
        in listOf('A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y') -> {
            println("$favouriteChar - гласная буква")
        }

        in 'A'..'Z', in 'a'..'z' -> {
            println("$favouriteChar - согласна буква")
        }

        else -> {
            println("$favouriteChar - это не буква латинского алфавита.")
        }
    }

    println(
        """
        =========================
        Имя: $name
        Возраст: $age.
        Рост: $height м, Вес: $weight кг
        BMI: $bmiFormatted (категория $bmiCategory)
        Совершеннолетний: ${if (isAdult) "да" else "нет"}
        Любимое число: $favourite (тип: ${favourite::class.simpleName})
        Введен символ: ${favouriteChar}
        =========================
    """.trimIndent()
    )
}