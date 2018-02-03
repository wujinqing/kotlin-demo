package com.jin.kotlin2

// 泛型方法

fun <T> getValue(item: T): T {
    return item
}

fun main(args: Array<String>) {
    var item = getValue<Int>(3);
    println(item)

    val item2 = getValue("hello")
    println(item2)

    var  upperBounds = UpperBoundsClass<Parent>()
}

open class Parent

// 泛型上界, 默认上界Any?
class UpperBoundsClass<T: Parent>

// 多个上界， 同时满足
class UpperBoundsClass2<T> where T: Comparable<T>, T: Parent