package com.jin.kotlin

/**
 * @author wu.jinqing
 * @date 2018年01月31日
 *
 */

// 扩展属性

class MyExtensionProperty

val MyExtensionProperty.name: String
    get() = "hello"

fun main(args: Array<String>) {
    var myExtensionProperty = MyExtensionProperty()

    println(myExtensionProperty.name)
}