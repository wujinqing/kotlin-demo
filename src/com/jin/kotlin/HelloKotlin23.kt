package com.jin.kotlin

/**
 * @author wu.jinqing
 * @date 2018年01月30日
 *
 */

/**
 * 扩展：extension
 */

class ExtensionTest
{
    fun add(a: Int, b: Int) = a + b

    fun substract(a: Int, b: Int) = a - b
}

fun ExtensionTest.multiply(a: Int, b: Int): Int
{
    add(1, 3)
    return a * b
}


fun main(args: Array<String>) {
    var extensionTest = ExtensionTest();

    println(extensionTest.add(1, 2))
    println(extensionTest.substract(1, 2))
    println(extensionTest.multiply(1, 2))

    println("-------------------------------")

    myPrint(AA())
    myPrint(BB())

    println("-------------------------------")

    myPrint2(Parent1())
    myPrint2(Child1())
}

// 扩展函数的解析是静态的， 并不会对原有的类进行任何修改（即不会将新方法的字节码插入到原有类中）


/*
1. 扩展本身并不会真正修改目标类，也就是说它并不会在目标类中插入新的属性或是方法(可以通过javp -c 反编译字节码文件来证明)。
2. 扩展函数的解析是静态分发的，而不是动态的，即不支持多态，调用只取决于对象的声明类型。
3. 调用是由对象声明类型所决定的，而不是由对象的实际类型决定。

 */

open class AA

class BB: AA()

fun AA.a() = "a"
fun BB.a() = "b"

fun myPrint(aa: AA)
{
    println(aa.a())
}

open class Parent1
{
    open fun a() = "parent a"
}

class Child1: Parent1()
{
    override fun a() = "child a"
}

fun myPrint2(aa: Parent1)
{
    println(aa.a())
}