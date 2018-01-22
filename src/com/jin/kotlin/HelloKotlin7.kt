package com.jin.kotlin

/**
 * when 关键字，类似于Java的if else if...或者switch case
 */
fun main(args: Array<String>) {
    println(myPrint("hello"))
    println(myPrint("world"))
    println(myPrint("test"))

    println("-----")

    println(myPrint2("hello"))

    println("-----")

    var a = 22

    var result = when(a)
    {
        1 -> {
            println("a = 1")
            10
        }

        2 -> {
            println("a = 2")
            20
        }

        3, 4, 5 -> {
            println("a is 3 or 4 or 5")
            30
        }

        // kotlin的范围是左闭右闭的
        in 6..10 -> {
            println("a >= 6 and a <= 10")
            40
        }

        11, in 20..30, 33 -> {
            println("11, in 20..30, 33")
            60
        }

        else -> {
            println("a is other value")
            50
        }
    }

    println(result)
}

fun myPrint(str: String): String
{
    // when(...): ...这里既可以是变量也可以是表达式
//    when(str)
//    {
//        "hello" -> return "HELLO"
//        "world" -> return "WORLD"
//        "hello world" -> return "HELLO WORLD"
//        else -> return "other input"
//    }

    // when(...): ...这里既可以是变量也可以是表达式
    return when (str){
        "hello" -> "HELLO"
        "world" -> "WORLD"
        "hello world" -> "HELLO WORLD"
        else -> "other input"
    }
}

fun myPrint2(str: String) =
        when (str){
            "hello" -> "HELLO"
            "world" -> "WORLD"
            "hello world" -> "HELLO WORLD"
            else -> "other input"
        }