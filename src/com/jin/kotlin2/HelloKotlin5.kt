package com.jin.kotlin2

/*

    Kotlin: 声明处协变；Java: 使用处协变

    Kotlin中的out关键字叫做varience annotation(协变注解)，因为它是在类型参数声明处所指定的，因此我们
    称之为声明处协变（declaration-site variance）.

    对于Java来说则是使用处协变（use-site variance），其中类型通配符使得类型协变成为可能。

    class B <T extends CharSequence> {// 这不是协变，不要搞混

    }

    B<? extends ...> str = ...// 这才是协变
 */

/*
    如果泛型类只是将泛型类型作为其方法的输出类型(返回类型)，那么我们就可以使用out
    协变: produce = output = out
 */

// 如果一个泛型T是一个协变类型，它只能用于一个方法的返回类型，不能用于方法的参数类型
interface Producer<out T> {
    fun produce(): T // 只能用于一个方法的返回类型
}
/*
    如果泛型类只是将泛型类型作为其方法的输入类型，那么我们就可以使用in

    逆变: comsume = input = in
 */
// 如果一个泛型T是一个逆变类型，它只能用于方法的参数类型，不能用于一个方法的返回类型
interface Consumer<in T> {
    fun consume(item: T)
}

/*
    如果泛型类同时将泛型类型作为其方法的输入类型与输出类型，那么我们就不能使用out与in来修饰泛型

 */
interface ProducerConsumer<T> {
    fun produce(): T

    fun consume(item: T)
}


open class Fruit

open class Apple: Fruit()

class ApplePear: Apple()

class FruitProducer : Producer<Fruit> {
    override fun produce(): Fruit {
        println("Produce Fruit")

        return Fruit()
    }
}

class AppleProducer : Producer<Apple> {
    override fun produce(): Apple {
        println("Produce Apple")
        return Apple()
    }
}

class ApplePearProducer : Producer<ApplePear> {
    override fun produce(): ApplePear {
        println("Produce ApplePear")

        return ApplePear()
    }
}


fun main(args: Array<String>) {
    // 对于“out”泛型来说，我们可以将子类型对象赋给父类型引用(比较好理解 符合多态)
    val producer1: Producer<Fruit> = FruitProducer()
    val producer2: Producer<Fruit> = AppleProducer()// 如果不是协变out类型的泛型是不能讲子类泛型赋给父类泛型的
    val producer3: Producer<Fruit> = ApplePearProducer()

    producer2.produce()

    println("----------")

    // 对于"in" 泛型来说，我们可以将父类型对象赋给子类型引用(看起来反“多态”)
    // 协变与逆变归根结底来说是由多态实现的
    val consumer1: Consumer<ApplePear> = Human()

    // 子类型赋给父类型，为什么这种反“多态”可行，consumer2的consume只能接收ApplePear
    // 实际指向类型是Man,它的consume方法入参是Apple，由于ApplePear是Apple的子类所以能将ApplePear传给Apple， 还是多态
    val consumer2: Consumer<ApplePear> = Man()
    val consumer3: Consumer<ApplePear> = Boy()

    consumer2.consume(ApplePear())

}


class Human : Consumer<Fruit> {
    override fun consume(item: Fruit) {
        println("Consume Fruit")
    }
}

class Man : Consumer<Apple> {
    override fun consume(item: Apple) {
        println("Consume Apple")
    }
}

class Boy : Consumer<ApplePear> {
    override fun consume(item: ApplePear) {
        println("Consume ApplePear")
    }
}




































