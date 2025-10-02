package com.example.leetcode

fun isPalindrome(x: Int): Boolean {
    if(x<0){
        return false
    }
    val str = x.toString()
    return str == str.reversed()
}

fun main(){
    isPalindrome(1234567899)
}