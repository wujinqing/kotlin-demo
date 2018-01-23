package com.jin.kotlin

fun main(args: Array<String>) {
    var list = listOf("hello", "world", "hello world", "welcome", "goodbye")

    for (it in list) {
        println(it)
    }

    println("---------")

    when {
        "world" in  list -> println("world in list")
    }

    println("---------")

    if ("world" in list) {
        println("world in list")
    }

    println("---------")

    // 过滤长度大于5的， 转换成大写， 自然排序， 输出
    list.filter { it.length > 5 }.map { it.toUpperCase() }.sorted().forEach { println(it) }
}