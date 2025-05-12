package com.example.kotlin_t_bank.Class

import com.example.kotlin_t_bank.abstractClass.BankAccount
import com.example.kotlin_t_bank.abstractClass.BankAccountInterface

class DepositAccount(val name: String = "default"): BankAccountInterface {
    private var availableFunds: Double = 790_000.0
    override val bankAccountName: String
        get() = "Tinkoff"

    //Метод для получения доступных средств
    override fun getAvailableFunds(): Double {
        return availableFunds
    }

    //Метод для снятия средств со счета
    override fun withdrawMoney(amount: Double): Double {
        return if (amount > 0 && amount <= availableFunds) {
            availableFunds -= amount
            amount
        } else {
            0.0
        }
    }

    //Метод для внесения данных на карту
    override fun depositMoney(amount: Double) {
        if (amount > 0) {
            availableFunds += amount
            println("$amount рублей успеншно внесено на $name")
        } else {
            println("Невозможно внести отрицательную сумму")
        }
    }
}