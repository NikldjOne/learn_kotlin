package com.example.kotlin_t_bank.Class

fun main(){
    val person = Person("Saha");
    val person2 = Person("Dima", "Fly");
    println("У ${person.name} количество депозитов = ${person.accounts.size}")
    println("У ${person2.name} количество депозитов = ${person2.accounts.size}, ${person2.accounts.first().name}")
}