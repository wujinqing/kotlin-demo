package com.jin.kotlin3

/*
    对象表达式(object expression)
    java当中匿名内部类在很多场景下都得到了大量使用
    kotlin的对象表达式就是为了解决匿名内部类的一些缺陷而产生的
 */

/*
    java的匿名内部类：
    1.匿名内部类是没有名字的类
    2.匿名内部类一定是继承了某个父类，或者实现了某个接口
    3.Java运行时会将该匿名内部类当做它所实现的接口或者所继承的父类来看待(在匿名内部类里面新增的方法将无视)
 */

/*
对象表达式的格式：
object [: 若干个父类型，中间用逗号分隔] {

}
 */

interface MyInterface {
    fun myPrint(i: Int)
}

abstract class MyAbstractClass {
    abstract var age: Int
    abstract fun printMyAbstractClassInfo()
}

fun main(args: Array<String>) {
    // 底层会生成一个匿名内部类
    var myObject = object: MyInterface {
        override fun myPrint(i: Int) {
            println("i的值是: $i")
        }
    }

    myObject.myPrint(100)
    println("=====================")

    // 不实现任何接口，也不继承任何类的对象表达式
    var myObject2 = object {
        var myProperties = "hello world"
        fun myMethod() = "myMethod"
    }

    println(myObject2.myProperties)
    println(myObject2.myMethod())

    println("===========")

    var myObject3 = object : MyInterface, MyAbstractClass() {
        override fun myPrint(i: Int) {
            println("i = $i")
        }

        override var age: Int
            get() = 10
            set(value) {}

        override fun printMyAbstractClassInfo() {
            println("printMyAbstractClassInfo invoked")
        }
    }

    myObject3.myPrint(200)
    println(myObject3.age)
    myObject3.printMyAbstractClassInfo()
}





















