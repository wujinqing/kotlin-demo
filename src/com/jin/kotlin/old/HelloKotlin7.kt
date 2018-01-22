package com.jin.kotlin.old

/**
 * when 关键字
 *
 * @author wu.jinqing
 * @date 2017年11月08日
 *
 */
fun main(args: Array<String>) {
    println(myPrint("hello"))
    println(myPrint("world"))
    println(myPrint("test"))

    println("---------------")

    println(myPrint2("hello"))
    println(myPrint2("world"))
    println(myPrint2("test"))

    println("---------------")

    var a = 30

    var result = when(a) {
        1 -> {
            println("a = 1")
            10
        }
        2 -> {
            println("a = 2")
            20
        }
        3, 4, 5 -> {
            println("a = 3 or 4 or 5")
            30
        }
        // kotlin中的区间左闭区间右也是闭区间，java中的区间左闭区间右是开区间
        in 6..10 -> {
            println("a is between 6 and 10")
            40
        }

        else -> {
            println("a is other value")
            50
        }
    }

    println("result = ${result}")
}

fun myPrint(str: String): String
{
//    when (str)
//    {
//        "hello" -> return "HELLO"
//        "world" -> return "EORLD"
//        else -> return "other input"
//    }

    return when (str) {
        "hello" -> "HELLO"
        "world" -> "EORLD"
        else -> "other input"
    }
}

fun myPrint2(str: String) =
        when (str) {
            "hello" -> "HELLO"
            "world" -> "EORLD"
            else -> "other input"
        }