package com.jin.kotlin2

/**
 * @author wu.jinqing
 * @date 2018年01月31日
 *
 */

// data class: 数据类
// lombok

/*
    数据类需要满足如下要求：

    1.主构造方法至少要有一个参数
    2. 所有的主构造方法的参数都需要被标记为var或者val
    3.数据类不能是抽象的、open的、sealed的(密封的)以及inner的

    对于数据类，编译器会自动生成如下内容：

    1.equals/hashCode对。
    2.toString()方法， 形式为Person(name=zhangsan, age=20, address=shanghai)
    3.针对属性的componentN方法，并且按照属性的声明顺序来生成的(从1开始)

    关于数据类成员的继承要点：

    1.如果数据类中显式的定义了equals, hashCode或者toString()方法，或是在数据类的父类中将这些方法声明为了final，
      那么这些方法就不会再生成，转而使用已有的。
    2.如果父类拥有componentN方法，并且是open的以及返回兼容的类型，那么编译器就会在数据类中生成相应的componentN方法，
      并且重写父类的这些方法；如果父类中的这些方法由于不兼容的签名或者是被定义为final的，那么编译器就会报错。
    3.在数据类中显式提供componentN方法以及copy方法实现是不允许的。

    解构声明

    在主构造方法中有多少个参数，就会依次生成对应的component1，component2，component3...
    这些方法返回的就是对应的字段值，componentN方法是用来实现解构声明的
 */
data class Person(val name: String, var age: Int, var address: String)
{
//    fun copy(name: String, age: Int, address: String)
//    {
//
//    }
}

/*
    在jvm平台上，如果生成的类需要拥有无参的构造方法，那么就需要为所有属性指定默认值。
 */
data class Person2(val name: String = "", var age: Int = 20, var address: String = "tianjin")

fun main(args: Array<String>) {
    var person = Person("zhangsan", 20, "shanghai")

    println(person)
    person.age = 30

    println(person.age)

    var person2 = person.copy(address = "beijing")// 具名的方式赋值

    println("----------------------")
    println(person)
    println(person2)

    // 解构, 按顺序赋值
    var (name, age, address) = person
//    var (name, address) = person  // address -> 30

    println("$name, $age, $address")
}