package com.wangyn.designpatterns.factory.simple_factory;

/**
 * @description:
 * @author: wangyinan02
 * @date: 2018/12/24
 * @time: 下午5:23
 * Copyright (C) 2018 Meituan
 * All rights reserved
 */
public class WhiteDog implements Dog {
    @Override
    public void run() {
        System.out.println("WhiteDog每小时能跑100公里，并且能边跑边唱歌");
    }

    @Override
    public void eat() {
        System.out.println("WhiteDog每顿吃5斤饭");
    }
}
