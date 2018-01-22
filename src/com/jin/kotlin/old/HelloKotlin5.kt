package com.jin.kotlin.old

/**
 * @author wu.jinqing
 * @date 2017年11月08日
 *
 */
fun main(args: Array<String>) {
    println(convert2Uppercase("hello world"))
    println(convert2Uppercase(123))
}

/**
 * Any 类似于java中的Object. The root of the Kotlin class hierarchy. Every Kotlin class has [Any] as a superclass.
 *
 * is 关键字类似于java里面的instanceof.
 *
 */
fun convert2Uppercase(str: Any): String? {
    if(str is String)
    {
        return str.toUpperCase()
    }
    return null
}