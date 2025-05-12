package com.example.kotlin_t_bank.singleton
fun main(){
    MySingleton2.doSomething()
}

class MyCoolClass {
    companion object {
        val name = "Имя"

        fun create() = MyCoolClass()
        }

}

interface MyInterface {
    val myValue: Int

    fun doSomething()
}

object MySingleton : MyInterface {
    override val myValue: Int = 42;
    
    override fun doSomething() {
        println("")
    }

}
open class MySuperClass {
    open val myValue: Int = 42

    open fun doSomething() {
        println("я супер класс!")
        }
}

object MySingleton2 : MySuperClass() {
    override val myValue: Int = 43;

}