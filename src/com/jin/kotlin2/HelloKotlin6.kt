package com.jin.kotlin2

import kotlin.test.assertTrue

// use-site variance(type projection), 类型投影
// use-site variance: out和in后面跟的是具体类型
// declaration-site variance: out和in后面跟的不是是具体类型，而是T这种泛型

// 数组的浅拷贝
fun copy(from: Array<out Any>, to: Array<Any>)// Array<out Any> 使用处协变，类型投影
{
    assertTrue(from.size == to.size)

    for (i in from.indices)
    {
        to[i] = from[i]
    }
}

fun main(args: Array<String>) {
    val from: Array<Int> = arrayOf(1, 2, 3, 4) // Array<Int> 赋给了Array<Any> 如果不用协变是不能这样赋值的
    val to: Array<Any> = Array(4, {"hello" + it})

    to.forEach { println(it) }

    copy(from, to)

    println("----------")

    val array: Array<String> = Array(4, { _-> "hello"})

    for (item in array)
    {
        println(item)
    }

    println("----------")

    val array2: Array<Any> = Array<Any>(4, {it -> "hello" + it})

    for (item in array2)
    {
        println(item)
    }

    println("----------")

    setValue(array2, 1, "world")// String 赋给了Any
}

fun setValue(to: Array<in String>, index: Int, value: String)
{
    to[index] = value
}















