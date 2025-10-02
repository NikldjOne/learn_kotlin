package com.example.learn_kotlin.differntTheme


fun task1(s: String): Boolean {
    val stack = ArrayDeque<Char>()
    for (ch in s){
        when(ch) {
            '(', '[', '{' -> stack.addLast(ch)
            ')' -> if(stack.removeLastOrNull() != '(') return false
            ']' -> if(stack.removeLastOrNull() != '[') return false
            '}' -> if(stack.removeLastOrNull() != '{') return false
        }
    }
    return stack.size == 0
}

fun todo (){
    val queue = ArrayDeque<String>()
    queue.addLast("Почитать книгу")
    queue.addLast("Сделать дз")
    queue.addLast("Потренироваться")
    while (queue.isNotEmpty()) {
        val task = queue.removeFirst()
        println("Выполнил задачу: ${task}")
    }
}

fun main() {
    println(task1("(2 + (3 * 4))"))
    println(task1("((2 + 3)"))
    println(task1("()[]{}"))
    println(task1("(]"))
    println(task1("([)]"))
    todo()
}