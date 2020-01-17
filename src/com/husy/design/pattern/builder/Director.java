package com.husy.design.pattern.builder;

/**
 * @description: 老板下发任务
 * @author: husy
 * @date 2020/1/17
 */
public class Director {
	// 组装过程
	public void construct(Builder builder, String board, String monitors) {
		builder.buildBoard(board);
		builder.buildMonitors(monitors);
	}
}
