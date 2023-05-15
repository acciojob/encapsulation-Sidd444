package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.setName(1);
        System.out.print(obj.getName()); //Error:'Name' has private access in 'com.driver.RWOnly'
    }
}