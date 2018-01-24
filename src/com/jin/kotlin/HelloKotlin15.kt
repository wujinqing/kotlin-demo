package com.jin.kotlin

/**
 * 方法重写
 *
 * @author wu.jinqing
 * @date 2018年01月24日
 *
 */

/**
 * 在kotlin中要想重写一个父类的方法，必须满足两点
 * 1. 父类里面的方法必须用open修饰
 * 2. 子类里面的方法必须用override修饰
 */
open class Fruit
{
    // open修饰表示该方法可以被子类重写
    open fun name()
    {
        println("i am fruit")
    }

    fun expirationDate()
    {
        println("1 month")
    }
}

class Apple: Fruit()
{
    override fun name()
    {
        println("i am apple")
    }
}

open class Orange: Fruit()
{
    // final修饰表示这个方法不能再被子类重写
    final override fun name() {
        println("I am orange")
    }
}

fun main(args: Array<String>) {
    var apple = Apple()

    apple.name()
    apple.expirationDate()
}