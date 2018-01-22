package com.jin.kotlin
// 普通导入
//import com.jin.kotlin2.multiply
// 别名导入
import com.jin.kotlin2.multiply as myMultiply
/**
 * @author wu.jinqing
 * @date 2018年01月22日
 *
 * kotlin中通过：
 *
 * val：来定义常量
 * var：来定义变量
 *
 */
fun main(args: Array<String>) {
    // val 常量
    val a: Int = 1
    val b = 2 // 类型推断， 默认值是Int

    // var 变量
    var c: Int
    c = 3

    var d = 3
    d = 4

    println(d)
    // 行注释

    /**
     * 块注释
     */

    /*
    块注释
     */

    /**
     * /**
     * 嵌套注释
     * */
     */

    // kotlin不允许将小范围的类型的变量赋值给大范围类型的变量，比如讲short赋值给int(在java里面的允许的)
    var x = 10
    var y: Byte = 20
//    x = y // 不允许赋值
    x = y.toInt()
    println(x)

    // 导入import其他包的方法
//    println(multiply(2, 3)) // 普通导入
    println(myMultiply(2, 3)) // 别名导入

    val m = arrayOf(1, 2, 3)

    m.set(0, 4)
    m[1] = 5

    for(item in m)
    {
        println(item)
    }


}