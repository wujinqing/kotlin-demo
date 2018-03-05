package com.jin.kotlin3

/*
    Kotlin 访问外部类变量的方式: this@OutterClass.str
    Java访问外部类变量的方式：OutterClass.this.str
 */
class Person(val name: String, var age: Int)
{
    private val str: String = "Person属性"

    private inner class PersonFeature(var heigth: Int, var weigth: Int)
    {
        private val str: String = "PersonFeature属性"

        fun getPersonFeature()
        {
            var str: String = "局部变量"

            println("身高: $heigth, 体重：$weigth")

            println("${this@Person.str}")
            println("${this.str}")
            println(str)
            this@Person.method()
        }

    }


    fun method()
    {
        println("执行了Person的方法")
    }


    fun getPerson()
    {
        var personFeature = PersonFeature(120, 180)
        personFeature.getPersonFeature()
    }


}

fun main(args: Array<String>) {
    var person = Person("zhangsan", 30)

    person.getPerson()
}