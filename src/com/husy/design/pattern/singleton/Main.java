package com.husy.design.pattern.singleton;

/**
 * @description: TODO
 * @author: husy
 * @date 2020/1/17
 */
public class Main {
	public static void main(String[] args) {
		Resource con1 = SingletonEnum.INSTANCE.getInstance();
		Resource con2 = SingletonEnum.INSTANCE.getInstance();
		System.out.println(con1 == con2);
	}
}
