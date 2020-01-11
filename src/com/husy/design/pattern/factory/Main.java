package com.husy.design.pattern.factory;

public class Main {

    public static void main(String[] args) {
        FruitFactory factory = new FruitFactory();

        // 获取桃子对象
        Fruit peach = factory.buyFruit(FruitEnum.PEACH);
        peach.price();

        // 获取橘子对象
        Fruit orange = factory.buyFruit(FruitEnum.ORANGE);
        orange.price();
    }
}
