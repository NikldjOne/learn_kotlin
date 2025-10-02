package com.example.learn_kotlin.differntTheme

import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

val list = listOf(4, 7, 1, 9, 2)
val list2 = listOf(1, 3, 5, 7, 9)

fun minMax() {
    println(list.maxOrNull())
    println(list.minOrNull())
}

fun binarySearch() {
    println(list2.binarySearch(7))
    println(list2.any { it > 100 })
    println(list2.all { it > 0 })
    println(list2.count { it > 50 })
}

fun math() {
    println(sqrt(144.0).toInt())
    println(3.0.pow(5).toInt())
    println(abs(-123))
}

fun combo() {
    println(list.map { it * it }.sortedDescending().count { it > 50 })
}

fun main() {
    minMax()
    binarySearch()
    math()
    combo()
}