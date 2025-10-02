package com.example.kotlin_t_bank

import java.util.Locale

data class User(val name: String?, val email: String?)

val list: List<String?> = listOf("один", null, "3")
val listUser: List<User> =
    listOf(User("Kirill", " kek@g.com "), User("Kirill", "  kek@g.com"), User(null, "kek@g.com"))

fun main() {
    println(lengthString("kek"))
    println(lengthString(null))
    println(lengthListString(list))
    println(upperEmail("list"))
    println(upperEmail(null))
    println(upperNameList(listUser))
}

fun upperNameList(list: List<User>): List<User> {
    return list.mapNotNull { user ->
        user.name
            ?.trim()
            ?.uppercase(Locale.getDefault())
            ?.let { upperName ->
                User(name = upperName, email = user.email)
            }
    }
}

fun lengthString(value: String?): Int {
    return value?.length ?: 0
}

fun lengthListString(list: List<String?>): List<Int> {
    return list.mapNotNull { it?.length }
}

fun upperEmail(email: String?): String {
    return email?.uppercase(Locale.getDefault()) ?: "No email"
}