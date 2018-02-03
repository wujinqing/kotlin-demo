package com.jin.kotlin2

import kotlin.test.assertTrue

/*
    泛型：不变 <A>, 协变<out T>, 逆变<in T>
 */

// Producer out, Consumer in
// 协变 out 逆变 in
// 协变主要用来读取数据， 逆变主要用来写入数据
// 在kotlin中通过out和in关键字来支持协变和逆变
// 协变是将一个子类型赋给父类型，逆变是将一个父类型赋给子类型
class ParameterizedClass<A> (private val value: A)
{
    fun getValue(): A{
        return this.value
    }
}

class ParameterizedProducer<out T> (private val value: T)
{
    fun get(): T{
        return this.value
    }
}

class ParameterizedConsumer<in T> {
    fun toString(value: T): String {
        return value.toString();
    }
}


fun main(args: Array<String>) {
    val parameterizedClass = ParameterizedClass<String>("hello world")
    var result = parameterizedClass.getValue()

    assertTrue(result is String)

    println("-------")

    val  parameterizedProducer = ParameterizedProducer("welcome")
    var myRef: ParameterizedProducer<Any> = parameterizedProducer;

    assertTrue(myRef is ParameterizedProducer<Any>)

    val parameterizedConsumer = ParameterizedConsumer<Number>()
    val myRef2: ParameterizedConsumer<Int> = parameterizedConsumer

    assertTrue(myRef2 is ParameterizedConsumer<Int>)
}






























