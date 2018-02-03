package com.jin.kotlin2

class MyStorage<out T>(private var t: T)
{
    fun getValue() = t
//    fun setValue(t: T)
//    {
//
//    }
    fun setValue(t: @UnsafeVariance T)
    {
        this.t = t
    }


}

fun main(args: Array<String>) {
    var myStorage1: MyStorage<Int> = MyStorage(5)
    var myStorage2: MyStorage<Any> = myStorage1

    println(myStorage1.getValue())
    println(myStorage2.getValue())

    println("------------")

    myStorage2.setValue("hello")// 泛型擦除

//    println(myStorage1.getValue())
    println(myStorage2.getValue())
}