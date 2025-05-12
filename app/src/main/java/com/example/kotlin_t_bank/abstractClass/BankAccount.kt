package com.example.kotlin_t_bank.abstractClass

abstract class BankAccount {
    val bankAccountName = "Tinkoff"
    abstract fun getAvailableFunds(): Double
    abstract fun withdrawMoney(amount: Double): Double
    abstract fun depositMoney(amount: Double)

    fun info(){
        println("Счет банка $bankAccountName")
    }
}