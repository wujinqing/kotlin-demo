package com.jin.kotlin

// object declaration 对象声明

object MyObject {

    fun method()
    {
        println("method")
    }
}

fun main(args: Array<String>) {
    // 不需要创建对象，直接可以调用方法
    MyObject.method()

    println("--------")

    MyTest.MyObject.method()

    println("--------")

    MyTest.method()// 类似于静态方法， kotlin中没有静态方法
    println(MyTest.a)

    var v = MyTest.MyObject
    println(v.javaClass)

    D.bar()
    D.foo()
}

// companion object, 伴生对象
// 在kotlin中，与Java不同的是，类是没有static方法的。
// 在大多数情况下，kotlin推荐的做法是使用包级别的函数来作为静态方法
// kotlin会将包级别的函数当做静态方法来看待
// 什么是伴生对象，随着类的存在而存在的对象
// 在一个类中最多只允许出现一个对象
//在很多情况下伴生对象的名字是可以省略的, 默认的名字叫Companion

//注意：虽然伴生对象的成员看起来像是Java中的静态成员，但在运行期，他们依旧是真实对象的实例成员
//在JVM上，可以将伴生对象的成员真正的生成为类的静态方法和属性，这是通过@JvmStatic注解来实现的
//伴生对象在编译后会生成一个静态内部类

class MyTest
{
    // 伴生对象
    companion object MyObject{
        var a: Int = 100
        fun method()
        {
            println("method invoked!")
        }
    }
}

class D {

    companion object {
        // 用@JvmStatic注解修饰的成员反编译后将会看到是静态的
        @JvmStatic
        var age: Int = 1
        @JvmStatic
        fun foo()
        {
            println("foo")
        }

        fun bar()
        {
           println("bar")
        }
    }
}