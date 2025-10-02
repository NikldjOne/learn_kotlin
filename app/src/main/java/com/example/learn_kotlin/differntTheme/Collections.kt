package com.example.learn_kotlin.differntTheme

val mutList = mutableListOf(1, 2, 3)
val hashSet = hashSetOf(1, 2, 2, 3)
val nums = listOf(10, 20, 30, 40)
val storageFruits = hashMapOf<String, Int>("apple" to 3, "banana" to 5)
val chars = listOf<String>("A", "B", "C")
val evenList = listOf(1, 2, 3, 4, 5)
val sortList = mutableListOf(5, 3, 1, 4, 2)

fun baseCollections() {
    mutList.add(4)
    println("${mutList[0]} ${mutList[mutList.size - 1]}")
    println(hashSet)
}

fun methodsCollections() {
    println(nums.indexOf(30))
    println(nums.contains(50))
    println(storageFruits.getOrDefault("apple", 0))
    storageFruits.putIfAbsent("mango", 2)
}


fun iterations() {
    chars.forEach { k -> println("Элемент: ${k}") }
    println(evenList.filter { it % 2 == 0 }.toString())
    sortList.sort()
    println(sortList)
}

fun kombo(list: List<String>) {
    val map = list.associate { it to it.length }
    println(map)
}


fun main() {
    baseCollections()
    methodsCollections()
    iterations()
    kombo(list = listOf("cat", "dog", "mouse"))
}