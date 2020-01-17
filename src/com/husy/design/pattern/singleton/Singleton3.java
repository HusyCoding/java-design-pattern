package com.husy.design.pattern.singleton;

/**
 * @description: 饿汉式单例
 * @author: husy
 * @date 2020/1/17
 */
public class Singleton3 {
	private static Singleton3 instance = new Singleton3();
	private Singleton3() {}
	public static  Singleton3 getInstance() {
		return instance;
	}
}
