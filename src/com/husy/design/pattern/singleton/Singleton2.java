package com.husy.design.pattern.singleton;

/**
 * @description: 线程安全型懒汉式单例
 * @author: husy
 * @date 2020/1/17
 */
public class Singleton2 {
	private static Singleton2 instance;
	private Singleton2() {}
	public static synchronized Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
}
