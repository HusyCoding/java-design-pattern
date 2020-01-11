package com.husy.design.pattern.factory;

/**
 * @description: TODO
 * @author: hsy
 * @date; 2020/1/11
 */
public class FruitFactory {
	/**
	 * 通过名称获取水果对象
	 *
	 * @param name
	 * @return
	 */
	public Fruit buyFruit(FruitEnum name) {
		if (name == null) {
			return null;
		}
		if (FruitEnum.PEACH == name) {
			return new Peach();
		}
		if (FruitEnum.ORANGE == name) {
			return new Orange();
		}
		return null;
	}
}
