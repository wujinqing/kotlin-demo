package com.jin.kotlin

/**
 * @author wu.jinqing
 * @date 2018年01月29日
 *
 */

/**
 * 延迟初始化属性
 *
 * Kotlin要求非空类型的属性必须要在构造方法中进行初始化
 * 有时，这种要求不太方便，比如可以通过依赖注入或者单元测试情况下进行属性赋值。
 *
 * 通过lateinit关键字标识属性为延迟初始化，需要满足如下3个条件：
 * 1. lateinit只能用在类体中声明的var属性上，不能用在primary constructor声明的属性上
 * 2. 属性不能拥有自定义的setter和getter
 * 3.属性类型需要为非空，且不能是原生数据类型
 *
 */
class TheClass {
    lateinit var name: String
    lateinit var address: String

    // 方法名字叫什么无所谓，保证在使用前赋上值就行
    fun init()
    {
        this.name = "lisi"
    }

    fun print()
    {
        println(this.name)
    }
}

fun main(args: Array<String>) {
    var theClass = TheClass();
    theClass.name = "zhangsan"
    println(theClass.name)
}