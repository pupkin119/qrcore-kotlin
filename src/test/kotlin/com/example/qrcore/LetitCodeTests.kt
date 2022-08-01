package com.example.qrcore

import org.junit.jupiter.api.Test
import kotlin.math.pow

class LetitCodeTests {
    @Test
    fun twoSum() {
//        this.twoSumTarget(intArrayOf(2,7,11,15), 9)
//        assert(this.twoSumTarget(intArrayOf(2,7,11,15), 9).contentEquals(intArrayOf(0,1)))

//        assert(this.twoSumTarget(intArrayOf(2,4,11,3), 6).contentEquals(intArrayOf(1,3)))
        this.twoSumTarget(intArrayOf(2, 4, 11, 3), 6)
    }

    fun twoSumTarget(nums: IntArray, target: Int): IntArray {
        var targetArray = intArrayOf()
        val map = hashMapOf<Int, Int>()
        nums.forEachIndexed { index: Int, i: Int ->
            run {
                map.put(index, i)
            }
        }
        map.forEach()
        {
            if (map.containsValue(target - it.value)) {
                val findKey = map.entries.find { vv -> vv.value == (target - it.value) }?.key
                println(findKey)
                findKey?.let { findKey ->
                    if (findKey != it.key) {
                        targetArray = intArrayOf(it.key, findKey)
                        return@forEach
                    }
                }
            }
        }
        return targetArray
    }

    @Test
    fun testTwoNumbers() {
        addTwoNumberss(buildListNode(arrayListOf<Int>(2,4,3)) ,buildListNode(arrayListOf<Int>(5,6,4)))
    }

    fun getLastNode(listNode: ListNode): ListNode {
        var currentNode = listNode
        while (currentNode.next != null) {
            currentNode = currentNode.next!!
            if(currentNode.next == null) {
                return currentNode
            }
        }
        return currentNode
    }

    fun buildListNode(list: ArrayList<Int>): ListNode? {
        var initNode: ListNode? = null
        var currentNode: ListNode? = null
//        list.reverse()
        list.forEachIndexed { index, i ->
            if (index == 0) {
                initNode = ListNode(i)
            } else {
                this.getLastNode(initNode!!).next = ListNode(i)
            }

        }
        var nextBlah = initNode
        println("begin while")
        while (nextBlah!!.next != null) {
//            firstNumber += nextNode.`val`
            println("nextblah")
            println(nextBlah!!.`val`)
            nextBlah = nextBlah.next
        }
        return initNode
    }


    var li = ListNode(5)
    var v = li.`val`

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }


    fun addTwoNumberss(l1: ListNode?, l2: ListNode?): ListNode? {
        var firstNumber: Int = 0
        var twoNumer = 0
        var nextNode: ListNode? = l1
        var bb = mutableListOf<Int>()
        while (nextNode?.next != null) {
//            firstNumber += nextNode.`val`
            bb.add(nextNode.`val`)
            nextNode = nextNode.next
        }

        println(bb)

        nextNode = l2
        var bb2 = mutableListOf<Int>()
        while (nextNode?.next != null) {
            bb2.add(nextNode.`val`)
            nextNode = nextNode.next
        }
        println(bb2)

        bb.reverse()
        bb.forEachIndexed { index, i ->
            firstNumber += i * (10.0.pow(index)).toInt()
        }

        bb2.reverse()
        bb2.forEachIndexed { index, i ->
            twoNumer += i * (10.0.pow(index)).toInt()
        }


        print("blha")
        println(twoNumer + firstNumber)
        val result = twoNumer + firstNumber

        val blah = result.toString()
        var resultNode: ListNode? = null
        blah.forEachIndexed { index, char ->
            run {
                if (index == 0) {
                    resultNode = ListNode(char.toInt())
                } else {
                    resultNode?.next = ListNode(char.toInt())
                }
            }

        }

        return resultNode
    }
}