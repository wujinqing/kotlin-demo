package com.jin.kotlin

/**
 * @author wu.jinqing
 * @date 2018年01月29日
 *
 */

/**
 * 可见性 visibility
 * Kotlin提供了4种可见性修饰符：
 *
 * 当修饰顶层声明时，4种可见性修饰符的作用：
 * 1. private 只能在当前文件里面用
 * 2. protected 不能修饰顶层的方法和类
 * 3.internal 只能在同一个模块下面使用（什么是模块就是当前项目）
 * 4.public 任何地方都能用
 *
 */

// 直接在包下面写的都叫顶层声明，如：method()，Clazz， 不加修饰符默认就是public
// java默认是包级别的访问
fun method()
{

}

class Clazz


/**
 * 可见性 visibility
 * Kotlin提供了4种可见性修饰符：
 *
 * 当修饰类时，4种可见性修饰符的作用：
 * 1. private 只能在当前类里面用
 * 2. protected 能在当前类及子类里面使用
 * 3.internal 在相同模块里面，如果能调用这个类，那就可以使用
 * 4.public 任何地方都能用
 *
 */
class Clazz1
{

}

/**
 * 局部变量
 * 比如：方法里面传递的参数
 *
 *
 */
