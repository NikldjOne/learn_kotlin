package com.example.learn_kotlin.differntTheme

import kotlin.collections.toIntArray

val arr = listOf(1, 2, 5, 4, 5, 91, 7, 9, 10)
val arr2 = intArrayOf(2, 4, 6, 8)

fun base() {
    println(arr.size)
    println(arr.lastIndex)
    for (i in arr.indices) {
        println("Ячейка ${i} значение = ${arr[i]}")
    }
    for (i in arr) {
        println(i)
    }
}

fun range() {
    for (i in 0 until 9) {
        println(i)
    }
    println("______")
    for (i in 10 downTo 1) {
        println(i)
    }
    println("_______")
    for (i in 0..20 step 2) {
        println(i)
    }
}

fun modification() {
//    val list = arr2.toMutableList()
//    list.add(10)
//    val newArr = list.toIntArray()
//    for (i in newArr) {
//        println(i)
//    }
    val newArr = (arr2.toList() + 10).toIntArray()
    for (i in newArr) {
        println(i)
    }
}

fun task4() {
    val list = mutableListOf<Int>()
    for (i in 2..20 step 2) {
        list.add(i)
    }
    val newArr = list.toIntArray()
    for (i in newArr.indices) {
        println("Индекс ${i}: ${newArr[i]}")
    }
}

fun main() {
//    base()
//    range()
    modification()
//    task4()
}