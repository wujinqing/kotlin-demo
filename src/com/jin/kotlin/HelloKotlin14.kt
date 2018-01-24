package com.jin.kotlin

/**
 * 在kotlin中，所有类在默认情况下都是无法继承的，
 * 换句话说，在kotlin中，所有类在默认情况下都是final的，
 * open的含义与final相反，表示这个类可以被继承
 *
 */

open class Parent(name: String, age: Int)
{

}

class Child(name: String, age: Int): Parent(name, age)
{

}


/**
 * 在kotlin中，如果一个类没有primary构造方法，
 * 那么这个类的每一个secondary构造方法就需要通过调用super关键字来初始化父类型，
 * 或是通过其他secondary构造方法完成这个任务，
 * 不同的secondary构造方法可以调用父类型的不同的构造方法
 */
open class Parent2(name: String)
{

}

class Child2: Parent2
{
    constructor(name: String): super(name)
    {

    }
}