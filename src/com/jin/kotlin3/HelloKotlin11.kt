package com.jin.kotlin3

import java.awt.event.ActionEvent
import java.awt.event.ActionListener

/*
    对象声明：用来声明一个对象的，可以生成单例对象

    对象声明 VS 对象表达式：

    1.对象表达式可以赋值给一个变量，对象声明不能赋值给变量。
    2.对象表达式是立刻初始化，对象声明是延迟初始化的，在第一次访问的时候初始化。
 */
object MyObject {
    fun method() = "hello world"
}

object MyObject2 : ActionListener {
    override fun actionPerformed(e: ActionEvent?) {

    }
}

/*
    关于对象表达式与对象声明之间的区别：

    1.对象表达式是立刻初始化或执行的。
    2.对象声明是延迟初始化的，在首次访问的时候进行。
    3.伴生对象是在其所对应的类被加载时初始化的，对应于Java的静态初始化。
 */
fun main(args: Array<String>) {
    println(MyObject.method())
}