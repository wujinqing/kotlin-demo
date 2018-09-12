package com.jin.kotlin3

/*
    类似于Java的匿名内部类，kotlin对象表达式中的代码是可以访问到外层的变量。
    与Java不同的是，外层变量无需声明为final.

    kotlin的对象表达式很大程度上是为了替换掉Java的匿名内部类的。
 */
fun main(args: Array<String>) {
    var i = 100

    var myObject = object {
        fun myMethod()
        {
            i++
        }
    }

    myObject.myMethod()

    println(i)
}