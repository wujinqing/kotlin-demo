package com.jin.kotlin

/**
 * Any: kotlin的Any类型类似与Java的Object类型
 */
fun main(args: Array<String>) {
    println(convert2Uppercase("hello world"))
    println(convert2Uppercase(23))
}

/**
 * is 关键字类似与Java里面的instanceof关键字
 */
fun convert2Uppercase(str: Any): String?
{
    if(str is String)
    {
        //智能的转换为String类型
        return str.toUpperCase()
    }

    return null
}