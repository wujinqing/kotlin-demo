package com.jin.kotlin

/**
 * @author wu.jinqing
 * @date 2017年11月09日
 *
 */
fun main(args: Array<String>) {
    var array = listOf<String>("hello", "world", "hello world", "welcome", "goodbye")

    for( item in array){
        println(item)
    }

    println("---------------")

    when {
        "world" in array -> println("world in collection")
    }

    println("---------------")

    array.filter { it.length > 5 }.map { it.toUpperCase() }.sorted().forEach { println(it) }
}