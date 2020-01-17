package com.husy.design.pattern.abstractfactory;

/**
 * @description: 戴尔产品配件
 * @author: husy
 * @date 2020/1/17
 */
public abstract class DELLParts extends Parts {
	public DELLParts(String typeName, double price) {
		super(typeName,price,"戴尔(DELL)");
	}
}

