package com.jin.kotlin.old

/**
 * @author wu.jinqing
 * @date 2017年11月08日
 *
 */
fun main(args: Array<String>) {
    // IntArray -> int[]
//    var array:IntArray = intArrayOf(1, 2, 3, 4, 5)
    var array = intArrayOf(1, 2, 3, 4, 5)

    // 按元素遍历
    for(item: Int in array)
    {
        println(item)
    }

    println("--------------")

    for (item in array)
    {
        println(item)
    }

    println("--------------")

    // 按索引遍历
    for(i: Int in array.indices)
    {
        println("array[$i] = ${array[i]}")
    }

    println("--------------")

    for(i in array.indices)
    {
        println("array[$i] = ${array[i]}")
    }

    println("--------------")

    // 按元素和索引遍历
    for((index, value) in array.withIndex())
    {
        println("array[${index}] = ${value}")
    }
}