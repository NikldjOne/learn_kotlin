package com.example.kotlin_t_bank.enumSealedClass

fun main() {
    getPurchaseStatus(PurchaseStatus.READY)
    for(status in PurchaseStatus.entries){
        println("name: ${status.name}, ordinal: ${status.ordinal}")
    }
}

fun getPurchaseStatus(status: PurchaseStatus) {
    when (status) {
        PurchaseStatus.IN_PROGRESS -> println("Доставка в процессе")
        PurchaseStatus.READY -> println("Доставка готова")
        PurchaseStatus.CANCELED -> println("Доставка отменена")
        else -> println("")
    }
}