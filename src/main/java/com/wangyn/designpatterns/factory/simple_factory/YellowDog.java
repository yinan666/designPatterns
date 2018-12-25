package com.wangyn.designpatterns.factory.simple_factory;

/**
 * @description:
 * @author: wangyinan02
 * @date: 2018/12/24
 * @time: 下午5:23
 * Copyright (C) 2018 Meituan
 * All rights reserved
 */
public class YellowDog implements Dog {
    @Override
    public void run() {
        System.out.println("YellowDog每小时能跑40公里");
    }

    @Override
    public void eat() {
        System.out.println("YellowDog每顿吃10斤饭");
    }
}
