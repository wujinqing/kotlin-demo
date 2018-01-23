package com.jin.kotlin

/**
 * 范围Range
 */
fun main(args: Array<String>) {
    val a = 10
    val b = 10

    if (a in 2..b) {
        println("in the range")
    }

    if (a !in 2..b) {
        println("out of range")
    }

    println("---------")

    for (i in 2..10) {
        println(i)
    }

    println("---------")

    for (i in 2.rangeTo(10)) {
        println(i)
    }
    println("---------")

    // step中缀表达式， 步进为2
    for (i in 2..10 step 2) {
        println(i)
    }

    println("---------")

    for (i in 10 downTo 2 step 4) {
        println(i)
    }
}