package com.jin.kotlin2

/**
 * @author wu.jinqing
 * @date 2018年02月01日
 *
 */

/*
    泛型(generics): 表示变量类型的参数化
 */

class MyGeneric<T> (t: T)
{
    var variable: T
    init {
        this.variable = t
    }
}

fun main(args: Array<String>) {
//    var myGeneric: MyGeneric<String> = MyGeneric<String>("hello world")
    var myGeneric = MyGeneric("hello world")// 借助于kotlin的类型推断
    println(myGeneric.variable)
}