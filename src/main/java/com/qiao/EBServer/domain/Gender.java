package com.qiao.EBServer.domain;

/**
 * <p>Title: Gender</p>
 * <p>Description: </p>
 * @author: zheng.qq
 * @date: 2015年12月17日
 */
public enum Gender{
    //通过括号赋值,而且必须带有一个参构造器和一个属性跟方法，否则编译出错
    //赋值必须都赋值或都不赋值，不能一部分赋值一部分不赋值；如果不赋值则不能写构造器，赋值编译也出错
    MAN("MAN"), WOMEN("WOMEN");
    
    private final String value;

    //构造器默认也只能是private, 从而保证构造函数只能在内部使用
    Gender(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
}
