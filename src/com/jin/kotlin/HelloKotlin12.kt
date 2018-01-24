package com.jin.kotlin

/**
 * @author wu.jinqing
 * @date 2018年01月24日
 * kotlin中类里面的所有属性都要初始化，没有默认值(这点和java不同，java中对象的默认值是null)
 */
class Person constructor(username: String)
{
    private var username:String
    private var age: Int
    private var address:String

    init {
        println(username)
        this.username = username
        this.age = 20
        this.address = "shang hai"
    }

    // secondary构造方法必须直接或者间接的调用primary构造方法
    constructor(username: String, age:Int): this (username)
    {
        println("username: $username, age: $age")
        this.username = username
        this.age = age
        this.address = "bei jing"
    }

    constructor(username: String, age: Int, address: String): this(username, age)
    {
        println("username: $username, age: $age, address: $address")
        this.address = address
    }

    fun printInfo()
    {
        println("username: $username, age: $age, address: $address")
    }
}

fun main(args: Array<String>) {
    val person1 = Person("zhangsan")
    println("--------------")

    val person2 = Person("lisi", 20)
    println("--------------")
    val person3 = Person("wangwu", 50, "hangzhou")

    println("--------------")

    person1.printInfo()
    person2.printInfo()
    person3.printInfo()

}