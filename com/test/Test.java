package com.test;
public class Test {
    int id=10;
    static String name = "Rama";

    void m1(){
        System.out.println(id);

    }
    static void m2(){
        System.out.println(name);
    }
    public static void main(String[] args){
        Test.m2();
        Test t=new Test();
        t.m1();
    }
}
