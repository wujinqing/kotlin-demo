package com.jin.kotlin

/**
 * @author wu.jinqing
 * @date 2018年01月22日
 *
 */
// kotlin流程控制语句

fun main(args: Array<String>) {
//    var x = 10
//    var y = 20
//
//    var max: Int
//    var min: Int
//
//    if(x < y)
//    {
//        max = y
//        min = x
//    }else
//    {
//        max = x
//        min = y
//    }
//
//    println("max = $max, min = $min")

//    var x = 10
//    var y = 20
//
//    // 表达式赋值给变量
//    var max = if(x > y) x else y
//    var min = if(x < y) x else y
//
//    println("max = $max, min = $min")

    var x = 10
    var y = 20

// ctrl + shift + 回车 补全代码
    var max = if (x > y) {
        println("x > y")
        x// 代码块的最后一个表达式作为代码块的返回值
    } else {
        println("x <= y")
        y
    }

    var min = if (x < y) {
        println("x < y")
        x
    } else {
        println("x >= y")
        y
    }
    println("max = $max, min = $min")

}