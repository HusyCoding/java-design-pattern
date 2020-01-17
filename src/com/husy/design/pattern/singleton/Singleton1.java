package com.husy.design.pattern.singleton;

/**
 * @description: 线程不安全型懒汉式单例
 * @author: husy
 * @date 2020/1/17
 */
public class Singleton1 {
	private static Singleton1 instance;
	private Singleton1() {}
	public static Singleton1 getInstance() {
		if (instance == null) {
			instance = new Singleton1();
		}
		return instance;
	}
}
