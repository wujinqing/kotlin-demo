package com.jin.kotlin3

// 内部类(Inner Class)

/*
    关于嵌套类和内部类之间的区别和联系：
    1.嵌套类: 对应于Java的静态内部类（即有static关键字修饰的内部类），只要在一个类的内部定义了另外一个类，那么这个类
    就叫做嵌套类，对应于Java当中有static关键字修饰的内部类。

    2.内部类：对应于Java中的非静态内部类（即没有static关键字修饰的内部类），使用inner关键字在一个类的内部所定义的另外
    一个类就叫做内部类，相当于Java当中没有static关键字修饰的内部类。


 */
class OutterClass2
{
    private var str: String = "hello world"

    inner class InnerClass// 可以看做和普通的成员变量如str, getName() 一个级别
    {
        fun innerMethod() = this@OutterClass2.str
    }

    fun getName(): String
    {
        // 局部嵌套类（没有inner）
         class LocalNestedClass
        {
            var name: String = "myTest"
        }

        var localNestedClass = LocalNestedClass()

        return localNestedClass.name
    }

}

fun main(args: Array<String>) {
    // 先创建外部类的对象，再创建内部类的对象
    println(OutterClass2().InnerClass().innerMethod())
    println(OutterClass2().getName())
}