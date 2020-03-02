package com.husy.design.pattern.prototype;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @description: 原型模式-浅拷贝
 * @author: husy
 * @date 2020/3/2
 */
public class Product implements  Cloneable , Serializable {
	private String name;
	private int[] array;

	public Product(String name, int[] array) {
		this.name = name;
		this.array = array;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	@Override
	public String toString() {
		return this.name+"--"+ Arrays.toString(this.array);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
		Product product = (Product) super.clone();
		// 将数组也拷贝一次
		product.array=this.array.clone();
		return product;
	}
}
