package com.jin.kotlin3

class OutterClass5
{
    inner class InnerClass5(str: String)
    {
        init {
            println(str)
        }
    }
}

fun main(args: Array<String>) {
    var innerClass5: OutterClass5.InnerClass5 = OutterClass5().InnerClass5("hello world")
}