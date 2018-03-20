package com.lzh.demo;

/**
 * @author lizhenghua
 */

public class Generic<T> {

    private T name;

    public Generic(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}