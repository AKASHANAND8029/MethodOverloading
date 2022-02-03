package com.overloading;

public class Addition {
    public int add(){
        return 0;
    }
    public int add(int a, int b){
        return a+b;
    }
    public double add(int a, double b){
        return a+b;
    }
    public float add(int a, float b){
        return a+b;
    }

    public int addMe(int...a){
        int sum=0;
        for(int i:a){
            sum+=i;
        }
        return sum;
    }
}
