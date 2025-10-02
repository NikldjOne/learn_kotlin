package com.example.leetcode

fun romanToInt(s: String): Int {
    val map = mapOf(
        "I" to 1,
        "IV" to 4,
        "V" to 5,
        "IX" to 9,
        "X" to 10,
        "XL" to 40,
        "L" to 50,
        "XC" to 90,
        "C" to 100,
        "CD" to 400,
        "D" to 500,
        "CM" to 900,
        "M" to 1000
    )
    var sum = 0
    val newArr = s.toCharArray()
    var i = 0
    while (i < newArr.size) {
        if (i + 1 < newArr.size) {
            val res = (newArr[i].toString() + newArr[i + 1])
            if (map.containsKey(res)) {
                sum += map[res] ?: 0
                i += 2
                continue
            }
        }
        sum += map[newArr[i].toString()] ?: 0
        i++
    }
    return sum
}

fun main() {
    println(romanToInt("III"))
    println(romanToInt("LVIII"))
    println(romanToInt("MCMXCIV"))
}