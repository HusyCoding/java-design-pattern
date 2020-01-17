package com.husy.design.pattern.builder;

/**
 * @description: 建造者
 * @author: husy
 * @date 2020/1/17
 */
public interface Builder {
	void buildMonitors(String system);
	void buildBoard(String board);
	Computer build();
}
