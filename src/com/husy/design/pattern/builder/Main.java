package com.husy.design.pattern.builder;

/**
 * @description: TODO
 * @author: husy
 * @date 2020/1/17
 */
public class Main {
	public static void main(String[] args) {
		//装机员工
		Builder macBuilder = new MacBuilder();
		Builder winBuilder = new WinBuilder();
		//找到销售店的老板，指定装机员工
		Director director = new Director();
		//Mac 系统组装配置
		director.construct(macBuilder,"i9级十核GTX1660Ti独显32G内存 ","飞利浦243V7 24英寸");
		//开始装机
		Computer computer = macBuilder.build();
		//小明查看一下配置信息，防止被骗了,输出电脑信息
		System.out.println(computer.toString());


		//Win 系统组装配置
		director.construct(winBuilder,"i7级八核GTX7450独显32G内存 ","LGD 30英寸");
		//开始装机
		computer = winBuilder.build();
		//输出电脑信息
		System.out.println(computer.toString());
	}
}
