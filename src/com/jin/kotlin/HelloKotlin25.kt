package com.jin.kotlin

/**
 * @author wu.jinqing
 * @date 2018年01月31日
 *
 */

// 伴生对象扩展

class CompanionObjectExtension {
    companion object MyObject{

    }
}

fun CompanionObjectExtension.MyObject.method()
{
    println("hello world")
}

fun main(args: Array<String>) {
    CompanionObjectExtension.method()
}