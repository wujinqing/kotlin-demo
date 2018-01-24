package com.jin.kotlin

/**
 * kotlin的类默认是public
 */
class EmptyClass

// 在kotlin中，一个类可以有一个primary构造方法以及一个或者多个secondary构造方法
// primary构造方法是类头(class header)的一部分，它位于类名后面，可以拥有若干个参数
// 如果primary构造方法没有任何注解或者可见性关键字修饰，那么constructor关键字可省略
//class MyClass constructor(username: String)
class MyClass (username: String)
{
    //primary构造方法的参数可以直接给属性赋初值，也可以在init块里面赋初值
    private var username = username.toUpperCase()

    init {
        println(username)
        this.username = username.toUpperCase()
    }
}

fun main(args: Array<String>) {
    var myClass = MyClass("zhang san")
}

