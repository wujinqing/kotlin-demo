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
//    println(convert2int1("abc"))
    printMultiply("a", "b")
    printMultiply("1", "2")
    printMultiply2("3", "4")
    printMultiply2("3", "b")

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

fun printMultiply(a: String, b: String)
{
    var a2int = convert2int(a) // 真实类型是Int?，不是Int
    var b2int = convert2int(b)

//    println(a2int * b2int) // 直接打印会报错
//
    if (a2int != null && b2int != null) {
        println(a2int * b2int)
    } else {
        println("param is not int")
    }
}

fun printMultiply2(a: String, b: String)
{
    var a2int = convert2int(a)// 真实类型是Int?，不是Int
    var b2int = convert2int(b)

    //    println(a2int * b2int) // 直接打印会报错

    if(a2int == null)
    {
        println("param is not int")
    }else if (b2int == null) {
        println("param is not int")
    } else {
        println(a2int * b2int)// 这样就不会报错，聪明的编译器，自动类型推断
    }
}