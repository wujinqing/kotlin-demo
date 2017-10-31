package com.jin.kotlin

fun main(args: Array<String>) {
    var i = convert2Int("bb")

    println(i)

    printMultiply("2", "3")
    printMultiply("2", "a")

    printMultiply2("4", "5")
    printMultiply2("5", "a")
}

fun convert2Int(str: String): Int? {
    try {
        return str.toInt()
    }catch (ex: NumberFormatException)
    {
        return null
    }
}

fun printMultiply(a: String, b: String) {
    val a2Int = convert2Int(a)
    val b2Int = convert2Int(b)

    if (null != a2Int && null != b2Int)
    {
        println(a2Int * b2Int)
    }else {
        println("param not int")
    }
}

fun printMultiply2(a: String, b: String) {
//    val a2Int: Int = convert2Int(a)
//    val a2Int: Int? = convert2Int(a)
    val a2Int = convert2Int(a)
    val b2Int = convert2Int(b)

    // 不能执行，编译报错
//    println(a2Int * b2Int)

    if( null == a2Int)
    {
        println("param not int")
    }else if(null == b2Int)
    {
        println("param not int")
    }else{
        println(a2Int * b2Int)
    }
}














