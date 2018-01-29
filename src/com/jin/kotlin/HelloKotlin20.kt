package com.jin.kotlin

/**
 * @author wu.jinqing
 * @date 2018年01月25日
 *
 */
class ThePerson {
    val age: Int = 20
    // 类似于java的 private int age
}

/**
 * var propertyName: propertyType = initializer
 * getter()...
 * setter()...
 *
 * 只读属性需要满足两点
 * 1.val修饰
 * 2.只有get方法
 *
 * backing field 支撑字段(域)
 * backing property 支撑属性（一个属性是private的， 通过另一个属性的set和get方法来访问这个字段 就叫支撑属性）
 */
class ThePerson2(address: String, name: String)
{
    val age: Int
        get() = 20

    var address: String = address
        get() {
            println("get invoked!")
            return field// field只能在set和get方法中使用  backing field, 不能return address不然会内存溢出，因为return address背后又是调用get方法就会出现死循环
        }
        set(value) {// setter方法约定的名字就是value
            println("set invoked!")
            field = value
        }

    var name: String = name // 底层是把name赋值给了backing field, set和get方法会隐式的生成出来（编译器自动生成）

    var city: String = ""
        private set
}

fun main(args: Array<String>) {
    val p = ThePerson()

    println(p.age)// 底层是调用age的get方法

    val p2 = ThePerson2("shanghai", "zhangsan")

    println(p2.age)

    println(p2.address)

    p2.address = "tianjin"
    println(p2.address)

    println(p2.name)

    p2.name = "lisi"

    println(p2.name)
}