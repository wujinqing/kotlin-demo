package com.jin.kotlin

/**
 * @author wu.jinqing
 * @date 2017年11月09日
 *
 */
// 默认是public的
class EmptyClass

// 在Kotlin中，一个类可以有一个primary构造方法以及一个或者多个secondary构造方法
// primary构造方法是类头（class header）的一部分，它位于类名后面，可以拥有着若干参数
// 如果primary构造方法没有任何注解或者可见性关键字修饰，那么constructor关键字可以省略
class MyClass constructor(username: String) {
    private val username = username.toUpperCase()
    // init代码块primary构造方法的实现
    init {
        println(username)
    }


}

fun main(args: Array<String>) {
    var myClass = MyClass("zhang san")
}