package com.husy.design.pattern.factory;

/**
 * @description: 商铺工厂类
 * @author: husy
 * @date 2020/1/17
 */
public class StoreFactory {

	//这个方法通常为静态方法，调用时不用实例化。这里就不写了
	public  Parts buy(PartsEnum type) {
		if (type == null) {
			return null;
		}
		if (PartsEnum.MOUSE == type) {
			return  new Mouse();
		}else if (PartsEnum.KEYBOARD == type) {
			return  new Keyboard();
		}
		return null;
	}
}
