package com.jin.kotlin2

/**
 * @author wu.jinqing
 * @date 2018年01月31日
 *
 */
/*
    密封类(sealed class), 类似于枚举

    父类与子类受限的关系
 */

sealed class Calculator

class Add: Calculator()

class Substract: Calculator()

fun calculte(a: Int, b: Int, cal: Calculator):Int
{
    return when (cal)  {
        is Add -> a + b
        is Substract -> a - b
    }
}

fun main(args: Array<String>) {
    println(calculte(1, 2, Add()))
    println(calculte(1, 2, Substract()))
}


