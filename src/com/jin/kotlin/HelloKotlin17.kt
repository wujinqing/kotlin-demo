package com.jin.kotlin

/**
 * @author wu.jinqing
 * @date 2018年01月24日
 *
 */
// 接口可以有实现
interface A
{
    fun method()
    {
        println("A")
    }

    fun doSomething()
}

open class B
{
    open fun method()
    {
        println("B")
    }
}

// 实现接口也用冒号，只是接口后面没有括号(因为接口是不能被实例化的)
// 同时继承A和B的method方法，必须显示的重写
class C: A, B()
{
    override fun method() {
        println("C")
        super<A>.method()
        super<B>.method()

    }

    override fun doSomething() {
        println("C doSomething")
    }
}

fun main(args: Array<String>) {
    var c = C()

    c.method()
    c.doSomething()
}