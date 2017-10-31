## Kotlin语言学习

#### 编译
> kotlinc HelloKotlin.kt


编译后会生成HelloKotlinKt.class字节码文件，注意文件名中多了个Kt.


#### 执行
> kotlin HelloKotlinKt

#### 用java的javap工具反编译class文件

> javap HelloKotlinKt

> 或者 javap -c HelloKotlinKt

#### 将kotlin代码打jar包

> kotlinc HelloKotlin.kt -include-runtime -d HelloKotlin.jar


#### 执行jar包
> java -jar HelloKotlin.jar












