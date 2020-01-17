package com.husy.design.pattern.abstractfactory;


public class Main {

    public static void main(String[] args) {
	    //1、小明来到电脑城，先定义电脑城工厂类
	    StoreFactory factory=null;

	    //2、小明来到华为专卖店，实例化华为专卖店
	    factory = new HUAWEIStoreFactory();
	    //3、向销售员说明需购买的产品--鼠标
	    Parts  parts = factory.buy(PartsEnum.HUAWEI_MOUSE);
	    parts.print();


	    //4、小明来再到戴尔专卖店，实例化戴尔专卖店
	    factory = new DELLStoreFactory();
	    //5、向销售员说明需购买的产品--键盘
	    parts = factory.buy(PartsEnum.DELL_MOUSE);
	    parts.print();
    }
}
