package com.husy.design.pattern.prototype;

/**
 * @description: TODO
 * @author: husy
 * @date 2020/3/2
 */
public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		String name = "喜洋洋";
		int[] array = {1,2};

		Product product1 = new Product(name,array);
		Product product2 =(Product) product1.clone();
		System.out.println(product1.toString());
		System.out.println(product2.toString());

		System.out.println("-------修改属性");
		product1.setName(  "灰太狼");
		array[1]=4;
		product1.setArray(array);

		System.out.println(product1.toString());
		System.out.println(product2.toString());


		System.out.println(">>>>>------序列化拷贝测试-----------<<<<<");

		String name1 = "喜洋洋";
		int[] array1 = {10,12};
		Product product3 = new Product(name1,array1);
		Product product4 = SerializedClone.clone(product3);
		System.out.println(product3.toString());
		System.out.println(product4.toString());
		System.out.println("-------修改属性");
		array[1]=3;
		product1.setArray(array);
		System.out.println(product3.toString());
		System.out.println(product4.toString());
	}
}
