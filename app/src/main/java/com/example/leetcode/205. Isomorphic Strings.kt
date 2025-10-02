package com.example.leetcode

fun isIsomorphic(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val mapST = hashMapOf<Char, Char>()
    val mapTS = hashMapOf<Char, Char>()

    for (i in s.indices) {
        val c1 = s[i]
        val c2 = t[i]

        if (mapST.containsKey(c1) && mapST[c1] != c2) return false

        if (mapTS.containsKey(c2) && mapTS[c2] != c1) return false

        mapST[c1] = c2
        mapTS[c2] = c1
    }

    return true
}

fun main() {
    println(isIsomorphic(s = "egg", t = "add"))
    println(isIsomorphic(s = "foo", t = "bar"))
    println(isIsomorphic(s = "paper", t = "title"))

}