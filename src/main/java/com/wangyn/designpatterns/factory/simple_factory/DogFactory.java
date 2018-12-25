package com.wangyn.designpatterns.factory.simple_factory;

/**
 * @description: 工厂模式， 属于通过客户端传入参数判断，创建不同的目标对象，好处 对客户端来说
 *               1、降低客户端对目标类的直接依赖，客户端只知道目标接口，具体的目标类在运行时才得到。
 *               2、隐藏了目标对象的创建细节，客户端只管通过工厂类得到目标对象，不用关心目标对象的创建细节。
 *               目标对象的创建细节，对客户端来说是不需要关心的。并且通常创建细节也意味着变化，工厂模式将创建细节的变化隔离在工厂类的方法中，不会扩散到客户端类的代码中。 这样就满足了两个原则： 1、依赖倒置原则。
 *               即依赖于抽象，并应该依赖于细节。 2、高内聚，低耦合。 创建细节的变化被内聚到工厂类中， 客户端和目标对象之前没有强耦合性。
 *
 * @author: wangyinan02
 * @date: 2018/12/24
 * @time: 下午5:30 Copyright (C) 2018 Meituan All rights reserved
 */
public class DogFactory {
    /**
     * @param eatMany
     * @param runFast
     * @return
     */
    public static Dog createDog(boolean eatMany, boolean runFast) {
        if (!eatMany && runFast) {
            return new MachineDog();
        } else if (eatMany && runFast) {
            return new WhiteDog();
        } else {
            return new YellowDog();
        }
    }
}
