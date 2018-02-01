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

    println("------------------")

    var myClass = MyClass<String, Number>("abc", 2);

    myTest(myClass)
}

// 协变(covariant)与逆变(controvariant)
// 协变 out: 只能读，不能写不然会报错, 类似java的? extends E
// 逆变 in： 只能写，不能读不然会报错, 类似java的? super E
class MyClass<out T, in M> (t: T, m: M)
{
    private var t: T
    private var m: M
    init {
        this.t = t
        this.m = m
    }

    fun get(): T = this.t
//    fun  set(t: T)
//    {
//        this.t = t
//    }
    fun set(m: M) {
        this.m = m
    }
}

fun myTest(myClass: MyClass<String, Number>)
{
    var myObject: MyClass<Any, Int> = myClass

    println(myObject.get())
    println(myObject.set(2))
}