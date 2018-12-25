package com.wangyn.designpatterns.factory.simple_factory;

/**
 * @description:
 * @formatter:on
 * `工厂模式， 属于通过客户端传入参数判断，创建不同的目标对象，好处 对客户端来说
 *  1、降低客户端对目标类的直接依赖，客户端只知道目标接口，具体的目标类在运行时才得到。
 *  2、隐藏了目标对象的创建细节，客户端只管通过工厂类得到目标对象，不用关心目标对象的创建细节。
 *  目标对象的创建细节，对客户端来说是不需要关心的。并且通常创建细节也意味着变化，工厂模式将创建细节的变化隔离在工厂类的方法中，不会扩散到客户端类的代码中。
 *  这样就满足了两个原则： 1、依赖倒置原则。即依赖于抽象，并应该依赖于细节。
 *                      2、开闭原则（不完全）。对于客户端来说，如果有新的dog对象加入，不需要修改客户端，dog只需要 创建细节的变化被内聚到工厂类中， 客户端和目标对象之前没有强耦合性。
 *  @formatter:off
 * @author: wangyinan02
 * @date: 2018/12/24
 * @time: 下午5:17 Copyright (C) 2018 Meituan All rights reserved
 */
public class TestMain {
    public static void main(String[] args) {
        /**
         * 注意，此处使用的是简单工厂模式，工厂类DogFactory是一个具体的类，如果深究起来，
         * 这个一步违反了依赖倒置原则， 应该依赖于抽象，而不应该依赖于具体实现。 方法工厂 解决了这个问题，一个产品对于一个工厂，客户端依赖工厂的抽象。
         * 一般情况下，如果仅仅是目标对象变化较多，单工厂种类基本不变（或变化较少），为了简便实现，则可以不将工厂类定义成依赖抽象的方式。
         */
        DogFactory dogFactory = new DogFactory();
        Client client = new Client(dogFactory);
        client.showPet();
    }
}
