package com.example.kotlin_t_bank

fun main() {;
    var text = "Hello"
//    printHello(text)
//    printResult(2,2)
//    sum2(22,22);
//    printCounts()
    println( sum3(22,22))
}

fun printHello(text: String?) {
    println(text)
}

fun getTextHello(): String {
    val text = "Hello"
    return text
}

fun printResult(result: Int){
    println(result)
}
fun printResult(a: Int, b: Int){
    println(a+b);
}
fun sum(a: Int, b: Int): Int {
    val result = a  + b;
    return result;
}

fun sum2(a: Int, b: Int): Int {
    return a + b;
}

fun printCounts() {
    print(1)
    print(2)
    print(3)
    return
    print(4)
    print(5)
}
fun sum3(a: Int, b: Int) = a + b

fun printResult2(result: Int = 10): Int {
    return result;
}