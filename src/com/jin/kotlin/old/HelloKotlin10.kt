package com.jin.kotlin.old

/**
 * @author wu.jinqing
 * @date 2017年11月09日
 *
 */
fun main(args: Array<String>) {
    var a = "hello \n world"

    println(a)
    // 三个双引号里面 的内容将原封不动的输出
    var b = """
        hello
        \n
           world
    """

    println(b)
}