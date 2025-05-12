package com.example.kotlin_t_bank

fun main() {
    val name: String = "Denis";
    val surname = "Ivanov";
    var score = 10;
    score = 10;
    var nullable = null
    println(nullable)
    printPersonalInfo(name = name, surname = surname)
    val i = 214748364
    val l: Long = 9_223_372_036_854_775_88L;
    plus(214748364,214748364)
    plus(5,10)
    minus(11,3)
    inc(22,7)
    div(5.8,2.8)
    plusDouble(11.5, 2.5)
}
fun plus(a: Int, b: Int){
    val result = a.toLong() + b;
    println(result)
}
fun plusDouble(a: Double, b: Double){
    val result = a + b;
    println(result)
}
fun minus(a: Int, b: Int){
    val result  = a - b;
    println(result)
}
fun inc(a: Int, b: Int){
    val res = a * b;
    println(res)
}
fun div(a: Double, b: Double){
    val result = a / b;
    println(result)
}

fun printPersonalInfo(name: String, surname: String){
    val result = "$name $surname"
    println(result)
}