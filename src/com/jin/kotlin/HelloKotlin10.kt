package com.jin.kotlin

/**
 * 转义字符, 三个双引号之间的内容会原封不动的输出
 */
fun main(args: Array<String>) {
    val a = "hello \n world"

    println(a)

    val b = """hello
        \n world
    welcome
"""
    println(b)
}