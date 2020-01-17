package com.husy.design.pattern.builder;

/**
 * @description: window 系统装机
 * @author: husy
 * @date 2020/1/17
 */
public class WinBuilder implements Builder {
	Computer computer = new WinComputer();
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
