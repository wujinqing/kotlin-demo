package com.jin.kotlin2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// PECS: Producer Extends, Consumer Super.
public class MyTest {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        List<Object> list2 = list;
//
//        list2.add(new Date());
//
//        String s = list.get(0);


        List<Cat> cats = new ArrayList<>();
        List<? extends Animal> animals = cats;// 协变

//        animals.add(new Cat());

    }
}

class Animal{

}

class Cat extends Animal {

}

class Dog extends Animal {

}
