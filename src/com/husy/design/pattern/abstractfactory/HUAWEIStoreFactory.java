package com.husy.design.pattern.abstractfactory;


/**
 * @description: 华为商铺工厂类
 * @author: husy
 * @date 2020/1/17
 */
public class HUAWEIStoreFactory extends StoreFactory {
	//这个方法通常为静态方法，调用时不用实例化。这里就不写了
	@Override
	public  Parts buy(PartsEnum type) {
		if (type == null) {
			return null;
		}
		if (PartsEnum.HUAWEI_MOUSE == type) {
			return  new HUAWEIMouse();
		}else if (PartsEnum.HUAWEI_KEYBOARD == type) {
			return  new HUAWEIKeyboard();
		}
		return null;
	}
}
