package com.example.kotlin_t_bank.tasks

fun main() {
    task6()
}

fun task6(){
        val n = readLine()!!.toInt()
        val arr = readLine()!!.split(" ").map { it.toInt() }

        val dp = Array(n) { IntArray(n) }

        for (len in 2..n step 2) {
            for (l in 0..n - len) {
                val r = l + len - 1
                dp[l][r] = dp[l + 1][r - 1] + kotlin.math.abs(arr[l] - arr[r])
                for (k in l + 1 until r step 2) {
                    dp[l][r] = maxOf(dp[l][r], dp[l][k] + dp[k + 1][r])
                }
            }
        }

        println(dp[0][n - 1])
}

fun task5() {
    val (n, x, y) = readLine()!!.split(" ").map { it.toInt() }
    val s = readLine()!!

    var open = 0
    var cost = 0
    var imbalance = 0

    val chars = s.toCharArray()
    var i = 0
    while (i < chars.size) {
        if (chars[i] == '(') {
            open++
        } else {
            if (open > 0) {
                open--
            } else {
                imbalance++
            }
        }
        i++
    }


    val swaps = minOf(imbalance, open)
    val remaining = (imbalance - swaps) + (open - swaps)

    if (x < 2 * y) {
        cost = swaps * x + remaining * y
    } else {
        cost = (imbalance + open) * y
    }

    println(cost)
}



fun task4() {
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }

    var count = 0

    for (i in 0 until n - 2) {
        for (j in i + 1 until n - 1) {
            for (k in j until n) {
                if (2 * arr[j] == arr[i] + arr[k]) {
                    count++
                }
            }
        }
    }

    println(count)
}


fun task3() {
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }.sortedDescending()

    val used = mutableSetOf<Int>()
    for (num in arr) {
        var current = num
        while (current > 0) {
            if (current !in used) {
                used.add(current)
                break
            }
            current /= 2
        }
    }
    println(used.size)
}

fun task1() {
    val s = readLine()!!
    val size = s.length - 1
    fun isPalindrome(str: String): Boolean {
        return str == str.reversed()
    }

    val result = (0..
            size).any { i ->
        val res = s.removeRange(i, i + 1)
        isPalindrome(res)
    }

    println(if (result) "YES" else "NO")
}

fun task2() {
    val n = readLine()!!.toInt()
    val lines = List(n) {
        val (s, d) = readLine()!!.split(" ").map { it.toInt() }
        s to d
    }

    val q = readLine()!!.toInt()
    repeat(q) {
        val (v, t) = readLine()!!.split(" ").map { it.toInt() }
        val (start, interval) = lines[v - 1]

        val nextTrainTime = if (t <= start) {
            start
        } else {
            val passed = (t - start + interval - 1) / interval // ceil
            start + passed * interval
        }

        println(nextTrainTime)
    }
}