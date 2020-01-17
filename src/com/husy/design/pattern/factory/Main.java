package com.husy.design.pattern.factory;

public class Main {

    public static void main(String[] args) {
	    //小明来到商店，找到我们的商店，先实例化商店工厂
	    StoreFactory factory = new StoreFactory();
	    //告诉老板，要电脑配件---键盘。得到配件对象
	    Parts  parts = factory.buy(PartsEnum.MOUSE);
	    parts.print();
    }
}
