package com.example.leetcode

fun longestCommonPrefix(strs: Array<String>): String {
    var str = strs[0]
    str.forEachIndexed { i, ch ->
        if (strs.any { it.length == i || it[i] != ch }) return str.substring(0, i)
    }
    return str
}

fun main() {
    println(longestCommonPrefix(arrayOf("flower", "flow", "flight")))
    println(longestCommonPrefix(arrayOf("dog", "racecar", "car")))
}