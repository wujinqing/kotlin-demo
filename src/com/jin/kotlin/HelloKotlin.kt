package com.jin.kotlin

/**
 * @author wu.jinqing
 * @date 2018年01月22日
 *
 */
// 变量名 冒号 类型
fun main(args: Array<String>)
{
    println(sum(1, 2))
    println(sum2(1, 2))
    myPrint(1, 2)
    myPrint1(1, 2)
}

// 返回类型在方法名后面
fun sum(a: Int, b: Int): Int
{
    return a + b
}

// 函数体只有一行
fun sum2(a: Int, b:Int) = a +b

// 没有返回值用Unit(也可以省略掉)，类似于java的void
fun myPrint(a: Int, b:Int): Unit
{
    println(a + b)
}

// 字符串模板，可以在字符串里面引用变量的值，通过$符号来引用, 如果是表达式的话用花括号表示
fun myPrint1(a: Int, b: Int)
{
    println("$a + $b = ${a + b}")
}





















