package com.jin.kotlin3

// Nested Class(嵌套类), 没有关键字修饰，内部类用inner修饰

// 静态的并不属于当前类本身，而是属于当前类的class对象

// 嵌套类不能访问外部类的其他成员，只能访问另一个嵌套类

class OutterClass
{
    private val str: String = "hello world!"

    /**
     * 嵌套类默认情况下不可能访问到外部类的成员变量，
     * 因为对于kotlin来说，默认所有成员都是非静态的，
     * kotlin就没有提供static关键字
     *
     *
     * 嵌套类除了能访问自己类里面对于的成员外，
     * 唯一能访问的就是在相同外部类下面的其他嵌套类，因为他们都是静态的
     *
     * 类比Java：静态的只能访问静态的， 非静态的可以访问一切
     */
    class NestedClass
    {
        fun nestedMethod() = "welcome"
    }

    class NestedClass2
    {

        var nestedClass = NestedClass()
    }
}

fun main(args: Array<String>) {
    // 类似于Java访问静态变量， 无需先创建外部类实例
    println(OutterClass.NestedClass().nestedMethod())
}