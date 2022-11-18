package com.kunal.singleton;

import com.kunal.access.A;

import java.util.ArrayList;
import java.util.Collections;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(45, "Kunal Kushwaha");
//        int n = obj.num;                   //here obj cannot access num bcoz num is protected and "protected variables" in super class can only be accessed by ref variable of type subclass when we are working in subclass.
    }
}

class SubSubclass extends SubClass {

    public SubSubclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubclass obj = new SubSubclass(45, "Kunal Kushwaha");
        int n = obj.num;
    }
}

class SubClass2 extends A {

    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(45, "Kunal Kushwaha");
//        int n = obj.num;
    }
}