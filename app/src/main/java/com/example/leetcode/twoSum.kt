package com.example.leetcode

open class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for(i in nums.indices){
            val result = target - nums[i]
            if(map.containsKey(result)){
                return intArrayOf(map[result]!!, i)
            }
            map[nums[i]] = i
        }
        return intArrayOf()
    }
}

fun main() {
    val sol = Solution();
    println(sol.twoSum(intArrayOf(2, 7, 11, 15), 9).joinToString())
    println(sol.twoSum(intArrayOf(3, 2, 4), 6).joinToString())
    println(sol.twoSum(intArrayOf(3, 3), 6).joinToString())
}