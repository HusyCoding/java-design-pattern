package com.husy.design.pattern.abstractfactory;

/**
 * @description: 华为产品配件
 * @author: husy
 * @date 2020/1/17
 */
public abstract class HUAWEIParts extends Parts{
	public HUAWEIParts(String typeName,double price) {
		super(typeName,price,"华为(HUAWEI)");
	}
}

