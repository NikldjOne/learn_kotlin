package com.example.kotlin_t_bank

import java.io.File
import java.io.IOException
import java.io.Reader

//fun main(){
//    var reader: Reader? = null
//
//    try {
//        reader = File("myfile.txt").bufferedReader()
//        println(reader.readText())
//        } catch (e: IOException) {
//        println("Произошла ошибка: ${e.message}")
//        throw Exception("Произошла ошибка: ${e.message}")
//        } finally {
//        println("Конец программы")
//        reader?.close()
//        }
//}
class ZeroDividerAssertionException: Exception()

fun assertDivider(divider: Int) {
    try {
        if (divider == 0) throw ZeroDividerAssertionException()
        } finally {
        print("assertDivider finally /")
        }
}

fun main() {
    try {
        assertDivider(0)
        } catch(e: RuntimeException) {
        print("main catch runtime exception /")
        } finally {
        print("main finally")
        }
}