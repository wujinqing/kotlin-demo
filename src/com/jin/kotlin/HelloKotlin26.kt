package com.jin.kotlin

/**
 * @author wu.jinqing
 * @date 2018年01月31日
 *
 */

// 扩展的作用域
/*
    1. 扩展函数所定义在的类实例叫做分发接收者(dispatch receiver)
    2. 扩展函数所扩展的那个目标类的实例叫做扩展接收者(extension receiver)
    3. 当以上两个名字出现冲突时，扩展接收者的优先级最高

扩展可以很好的解决java中充斥的各自辅助类问题

 */

// DD 是 extension receiver
class DD {
    fun method() {
        println("DD method")
    }
}

// EE 扩展了DD， EE 叫做 dispatch receiver

/*
    由于DD.hello()， DD.output()是定义在EE里面的（不是在顶层， 顶层的public的扩展可以在任何地方使用），所以他的作用域只能在EE里面使用
 */
class EE {
    fun method2()
    {
        println("EE method2")
    }

    fun DD.hello() {// 扩展方法既可以调用DD的方法也可以调用EE的方法
        method()
        method2()
    }

    fun world(dd: DD)
    {
        dd.hello()
    }

    fun DD.output()
    {
        println(toString())// 这里会调用DD的toString方法，而不会调用EE里面的， 因为DD的优先级更高
        println(this@EE.toString())
        this.toString()// DD
        this@EE.toString()// EE
    }

    fun test()
    {
        var dd = DD()

        dd.output()
    }
}

fun main(args: Array<String>) {
    var dd = DD()
//    dd.output() //不能调用， 超出了扩展函数output的作用域
    EE().test()
}

// 扩展可以很好的解决java中充斥的各自辅助类问题
// Collections.swap(list, 4, 10)  交换第4个和第10个元素
// list.swap(4, 10)