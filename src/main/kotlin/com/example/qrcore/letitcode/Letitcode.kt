package com.example.qrcore.letitcode

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var targetArray = intArrayOf()
        val map = hashMapOf<Int, Int>()
        nums.mapIndexed { index: Int, i: Int ->
            {
                map.put(i, index)
            }
        }
        map.forEach()
        {
            map.get(target - it.key)?.let { vv ->
                targetArray = intArrayOf(vv, it.value)
                return@forEach
            }
        }
        return intArrayOf()
    }
}