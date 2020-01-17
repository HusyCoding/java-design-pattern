package com.husy.design.pattern.builder;

/**
 * @description: 电脑
 * @author: husy
 * @date 2020/1/17
 */
public abstract class Computer {
	private String monitors;
	private String board;
	protected String os;
	public void setMonitors(String monitors) {
		this.monitors = monitors;
	}
	public void setBoard(String board) {
		this.board = board;
	}
	public void setOs(String os) {
		this.os = os;
	}

	@Override
	public String toString() {
		return "Computer{" +
				"monitors='" + monitors + '\'' +
				", board='" + board + '\'' +
				", os='" + os + '\'' +
				'}';
	}
}
