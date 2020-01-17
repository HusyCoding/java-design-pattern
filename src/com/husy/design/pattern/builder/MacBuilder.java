package com.husy.design.pattern.builder;

/**
 * @description: TODO
 * @author: husy
 * @date 2020/1/17
 */
public class MacBuilder implements Builder {
	Computer computer = new MacComputer();
	@Override
	public void buildMonitors(String monitors) {
		computer.setMonitors(monitors);
	}
	@Override
	public void buildBoard(String board) {
		computer.setBoard(board);
	}
	@Override
	public Computer build() {
		return computer;
	}
}
