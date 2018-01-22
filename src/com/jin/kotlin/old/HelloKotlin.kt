package com.jin.kotlin.old

fun main(args: Array<String>){
    println(sum(1, 2))
    println(sum2(3, 4))
    myPrint(2, 3);
    myPrint2(5, 6)
    myPrint3(1, 2)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

// 语法糖
//fun sum2(a: Int, b: Int): Int = a + b
// 语法糖, 类型推断
fun sum2(a: Int, b:Int)= a + b

// 无返回值
fun myPrint(a: Int, b: Int): Unit {
    println(a + b)
}

// 无返回值
fun myPrint2(a: Int, b: Int) {
    println(a + b)
}

// String Template 字符串模板
fun myPrint3(a: Int, b: Int)
{
    println("$a + $b = ${a + b}")
}