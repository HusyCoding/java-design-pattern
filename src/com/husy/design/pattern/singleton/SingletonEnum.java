package com.husy.design.pattern.singleton;

/**
 * @description: 枚举类型单例
 * @author: husy
 * @date 2020/1/17
 */


public enum SingletonEnum {
	INSTANCE;
	private Resource instance;
	SingletonEnum() {
		instance = new Resource();
	}
	public Resource getInstance() {
		return instance;
	}
}
class Resource{
}
