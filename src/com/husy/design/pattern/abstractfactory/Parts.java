package com.husy.design.pattern.abstractfactory;

/**
 * @description: 配件
 * @author: husy
 * @date 2020/1/17
 */
public abstract class Parts {
	String brand;
	String typeName;
	double price;

	public Parts(String typeName, double price,String brand) {
		this.typeName = typeName;
		this.price = price;
		this.brand = brand;
	}
	public void print() {
		System.out.println("配件类型/品牌/价格：" + typeName + "，" + brand + "，" + price);
	}
}

