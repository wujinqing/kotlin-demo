package com.jin.kotlin

/**
 * 数组
 *
 * Int -> java int
 * IntArray -> java int[]
 */
fun main(args: Array<String>) {
    var array = intArrayOf(1, 2, 3, 4, 5)
    // 按数组元素遍历
    for(item in array)
    {
        println(item)
    }

    println("---------")

    // 按数组下标遍历
    // indices是index的复数，代表数组索引下标
    for(i in array.indices)
    {
        println("array[$i] = ${array[i]}")
    }

    println("---------")

    //同时按数组下标和数组元素遍历

    for ((index, value) in array.withIndex()) {
        println("array[$index] = $value")
    }



}