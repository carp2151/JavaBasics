package com.lzh.demo;

/**
 * 三种注解标签
 *
 * @author lizhenghua
 */

public class Tags {

    public void todo() {
        // TODO: 待实现的功能
        System.out.println("TODO表示-待实现的功能");
    }

    public void fixme(){
        // FIXME: 实现方法待改进
        System.out.println("FIXME表示这里实现的功能待改进");
    }

    public void done(){
        // DONE: 此功能已经实现
        System.out.println("done表示此功能已经实现，且没有问题");
    }
}
