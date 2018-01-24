package com.jin.kotlin

/**
 * 属性的重写
 *
 * 1.父类val的属性可以被子类的val的属性重写
 * 2.父类val的属性可以被子类的var的属性重写
 * 2.父类var的属性不可以被子类的val的属性重写
 *
 * @author wu.jinqing
 * @date 2018年01月24日
 *
 */

/**
 * 属性的重写与方法的重写类似：
 * 1. 父类属性要加open修饰
 * 2. 子类属性要加override修饰
 */
open class MyParent
{
    open val name: String = "parent"
}

class MyChild: MyParent()
{
    override val name: String = "child"
}

class MyChild2(override val name: String = "child2"): MyParent()
{

}



/**
 *
 * 1. val 可以 override val
 * 2. var 可以 override val
 * 3. val 无法 override var
 *
 * 本质上，val相当于get方法；var相当于get与set方法
 * 可以把范围变大，不能把范围变小
*/
open class MyParent3
{
    open fun method()
    {
        println("parent method")
    }

    open val name: String

    get() = "parent"
}

class MyChild3: MyParent3()
{
    override fun method() {
        super.method()
        println("child method")
    }

    override val name: String
        get() = super.name + " and child"
}

fun main(args: Array<String>) {
    var myChild = MyChild()

    println(myChild.name)
//    myChild.name = "other" 报错， val变量不能再次赋值

    println("-------------")

    var myChild2 = MyChild2();

    println(myChild2.name)

    println("----------")

    var myChild3 = MyChild3();

    myChild3.method()
    println(myChild3.name)


}