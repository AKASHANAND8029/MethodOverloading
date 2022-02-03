package com.overloading;

public class Result {
    public static void main(String[] args) {
        Addition addition=new Addition();
        System.out.println(addition.add());
        System.out.println(addition.add(10,20));
        System.out.println(addition.add(10,200.90));
        System.out.println(addition.add(10,30.002f));
        System.out.println(addition.addMe());
        System.out.println(addition.addMe(10,20,30,40,60,20,30));
    }
}
