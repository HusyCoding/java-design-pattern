package com.husy.design.pattern.abstractfactory;

/**
 * @description: 商铺工厂类
 * @author: husy
 * @date 2020/1/17
 */
public abstract class StoreFactory {
	public abstract Parts buy(PartsEnum type);
}
