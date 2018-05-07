package com.jin.kotlin3

class OutterClassss4
{
    class NestedClass4
    {
        init {
            println("NestedClass4初始化块执行")
        }
    }
}

fun main(args: Array<String>) {
    var nestedClass4: OutterClassss4.NestedClass4 = OutterClassss4.NestedClass4()
}