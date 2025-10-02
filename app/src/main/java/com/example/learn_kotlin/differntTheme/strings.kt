package com.example.learn_kotlin.differntTheme


const val hello = "Kotlin is cool"
const val dev = "AndroidDeveloper"
const val colors = "red,green,blue,yellow"
const val words = "Ехал грека через река"

fun baseStr() {
    println("${hello[0]} ${hello[hello.length - 1]}")
    println(dev.substring(0, 7))
}

fun methods() {
    println(colors.split(","))
    val arrStr = "hello".toCharArray()
    for (i in arrStr.indices){
        println("Буква ${i} = ${arrStr[i]}")
    }
}
fun stringBuilder () {
    val str =  StringBuilder()
    for (i in 1 ..5){
        str.append("${i} ")
    }
    println(str)

}
fun combo (str: String){
    println(str.split(" ").joinToString(" ") { it.reversed() })
}

fun main() {
//    baseStr()
//    methods()
    stringBuilder()
    combo(words)
}