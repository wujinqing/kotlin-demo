package com.jin.kotlin

/**
 * @author wu.jinqing
 * @date 2018年01月22日
 *
 */
fun main(args: Array<String>) {
    println(convert2int("123"))
    println(convert2int("abc"))

    println(convert2int1("123"))
    println(convert2int1("abc"))
}

/**
 * 问号
 * Int? 表示返回int或者null
 */
fun convert2int(str: String): Int?
{
    try {
        return str.toInt()
    }catch (ex: NumberFormatException)
    {
        return null
    }
}

fun convert2int1(str: String): Int
{
    return str.toInt()

}