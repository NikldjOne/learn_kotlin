package com.example.kotlin_t_bank.Collections

fun main() {
//    leartList()
//    learnMap()

//    val numbers = listOf(1, 1, 2, 34, 0, 0, 0, -22, 84, 85, 44, 4)
//    println("список чисел ${getUniqueNumbers(numbers)}")
//
//    println(countOfRepeatForEachNumber(numbers))

}

fun countOfRepeatForEachNumber(numbers: List<Int>): Map<Int,Int> {
    val countOfRepeatForEachNumber = mutableMapOf<Int,Int>()

    numbers.forEach{currentNumber ->
        val currentNumberCount = countOfRepeatForEachNumber.getOrDefault(currentNumber, 0)
        countOfRepeatForEachNumber[currentNumber] = currentNumberCount + 1
    }
    return countOfRepeatForEachNumber;
}
fun getUniqueNumbers(numbers: List<Int>): Set<Int> {
    val uniqueNumbers = mutableSetOf<Int>()

    numbers.forEach{number -> uniqueNumbers.add(number)}

    return uniqueNumbers
}

fun leartList() {
    val numbers = mutableListOf(1, 1, 2, 34, 0, 0, 0, -22, 84, 85, 44, 4)
    println(numbers)
    println(numbers.size)

    numbers.add(99)
    println(numbers)

    numbers.remove(99)
    println(numbers)

    println(numbers.contains(99))
}

fun learnMap() {
    val products = mutableMapOf("arbuz" to 100, "cola" to 200, "orange" to 50)
    println(products)
    products["bread"] = 30;

    println(products);

    println(products["bread"])
    println(products.size)

    products.remove("bread")

    println(products.size)
    println(products.contains("arbuz"))
}