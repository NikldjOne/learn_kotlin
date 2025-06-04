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

    println("""
        =========================
        Имя: $name
        Возраст: $age.
        Рост: $height м, Вес: $weight кг
        BMI: $bmiFormatted (категория $bmiCategory)
        Совершеннолетний: ${if(isAdult)  "да" else "нет"}
        Любимое число: $favourite (тип: ${favourite::class.simpleName})
        Введен символ: ${favouriteChar}
        =========================
    """.trimIndent())
}