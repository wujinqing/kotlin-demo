package com.jin.kotlin3

enum class Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

enum class Season2(val temperature: Int) {
    SPRING(10), SUMMER(30), AUTUMN(20), WINTER(-10)
}

// 枚举声明方法
enum class Season3{
    SPRING{
        override fun getSeason(): Season3 = SPRING
    },

    SUMMER {
        override fun getSeason(): Season3 {
            return SUMMER
        }
    },

    AUTUMN {
        override fun getSeason(): Season3 = AUTUMN
    },

    WINTER {
        override fun getSeason(): Season3 = WINTER
    }
    ;

    abstract fun getSeason():Season3
}

fun main(args: Array<String>) {
    var seasons = Season.values()

//    seasons.forEach { season: Season -> println(season) }

    // it表示当前正在迭代的那个对象
    seasons.forEach { println(it) }

    println("--------")

    var season = Season.valueOf("SPRING")

    println(season.name)
}