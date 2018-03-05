package com.jin.kotlin3

// Nested Class(嵌套类), 没有关键字修饰，内部类用inner修饰

class OutterClass
{
    private val str: String = "hello world!"

    class NestedClass
    {
        fun nestedMethod() = "welcome"
    }
}

fun main(args: Array<String>) {
    // 类似于Java访问静态变量， 无需先创建外部类实例
    println(OutterClass.NestedClass().nestedMethod())
}