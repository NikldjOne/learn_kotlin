package com.example.kotlin_t_bank.abstractClass

interface BankAccountInterface {
    val bankAccountName: String
     fun getAvailableFunds(): Double
     fun withdrawMoney(amount: Double): Double
     fun depositMoney(amount: Double)

    fun info(){
        println("Счет банка $bankAccountName")
    }
}