package com.husy.design.pattern.factory;

/**
 * @description: 配件
 * @author: husy
 * @date 2020/1/17
 */
public abstract class Parts {
	String typeName;
	double price;

	public Parts(String typeName, double price) {
		this.typeName = typeName;
		this.price = price;
	}
	public void print() {
		System.out.println("配件类型/价格："+ typeName+"，"+price);
	}
}

