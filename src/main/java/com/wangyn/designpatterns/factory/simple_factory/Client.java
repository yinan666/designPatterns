package com.wangyn.designpatterns.factory.simple_factory;

/**
 * @description:
 * @author: wangyinan02
 * @date: 2018/12/24
 * @time: 下午5:30
 * Copyright (C) 2018 Meituan
 * All rights reserved
 */
public class Client {

    private DogFactory dogFactory;

    public Client(DogFactory factory){
        this.dogFactory = factory;
    }

    public void showPet(){
        Dog dog =  dogFactory.createDog(true,true);
        dog.eat();
        dog.run();
    }
}
