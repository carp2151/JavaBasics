package com.lzh.javaDemo;

public class Main {

    public static void main(String[] args) {
        Generic<String> generic = new Generic<String>("111");

        generic.setName("1111");

        System.out.println(generic.getName());
    }
}
