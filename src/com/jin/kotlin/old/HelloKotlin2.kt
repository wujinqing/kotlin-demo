package com.jin.kotlin.old

//import com.jin.kotlin.lesson01.multiply

// 别名的方式导入
import com.jin.kotlin.old.lesson01.multiply as myMultiply

fun main(args: Array<String>) {
    //定义一个常量
    val a: Int = 1

    val b = 2

    // 定义一个变量
    var c: Int
    c = 3
    c=4

    var d = 3
    d=4

    println(d)

    //Kotlin注释
    // 行注释
    /**
     *
     * 块注释
     */

    /*
    块注释
     */

    /*
    /*
    /**
    */
     */
    块注释, 嵌套
     */

    var x = 10
    var y: Byte = 20

    // 不允许将Byte转换成Int
    //x = y
    x = y.toInt()
    println(x)

//    println(multiply(2, 3))
    // 别名的方式导入
    println(myMultiply(2, 3))

    // 类似Java中的final关键字m不能再指定新的对象， 但可以修改m所指的对象的值
    val m = intArrayOf(1, 2,3)
//    m = intArrayOf(5, 6, 7)
    m.set(0, 9)
    for (item in m)
    {
        println(item)
    }
}
