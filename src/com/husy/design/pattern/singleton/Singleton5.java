package com.husy.design.pattern.singleton;

/**
 * @description: 登记式/静态内部类单例
 * @author: husy
 * @date 2020/1/17
 */
public class Singleton5 {
	private static class SingletonHolder {
		private static final Singleton5 INSTANCE = new Singleton5();
	}

	private Singleton5() {}
	public static final Singleton5 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
