package com.husy.design.pattern.singleton;

/**
 * @description: 双检索单例
 * @author: husy
 * @date 2020/1/17
 */
public class Singleton4 {
	private volatile static Singleton4 instance ;
	private Singleton4() {}
	public static Singleton4 getInstance() {
		if (instance == null) {
			synchronized (Singleton4.class) {
				if (instance == null) {
					instance = new Singleton4();
				}
			}
		}
		return instance;
	}
}
