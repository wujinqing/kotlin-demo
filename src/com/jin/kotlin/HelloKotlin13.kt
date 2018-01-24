package com.jin.kotlin

/**
 * @author wu.jinqing
 * @date 2018年01月24日
 *
 */

/**
 * 构造方法与属性的简便写法
 *
 * 属性可以直接定义在primary构造方法里面
 *
 * username 默认public访问级别
 */
class Student(var username: String, private var age: Int, private var address: String)
{
    fun printInfo()
    {
        println("username: $username, age: $age, address: $address")
    }
}

/**
 * 如果primary构造方法拥有注解或者可见性修饰符，
 * 那么constructor关键字是不能可省略的，并且位于修饰符后面
 */
class Student2 private constructor(username: String)
{

}

/**
 * 在JVM上，如果类的primary构造方法的所有参数都拥有默认值，
 * 那么kotlin编译器就会为这个类生成一个不带参数的构造方法，
 * 这个不带参数的构造方法会使用这些参数的默认值，
 * 这样做的目的在于可以跟Spring等框架更好的集成
 */
class Student3 constructor(username: String = "zhangsan")
{

}

fun main(args: Array<String>) {
    var student = Student("zhangsan", 20, "shanghai")

    student.printInfo()

    val s = Student3()
}