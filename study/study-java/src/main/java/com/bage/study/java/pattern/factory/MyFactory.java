package com.bage.study.java.pattern.factory;

import com.bage.study.java.pattern.factory.ProductFactory.ProductType;

/**
 * 工厂模式是 Java 中最常用的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。<br>
        工厂模式主要是为创建对象提供过渡接口，以便将创建对象的具体过程屏蔽隔离起来，达到提高灵活性的目的。
 * @author bage
 *
 */
public class MyFactory {

	public static void main(String[] args) {
		// 参考例子(静态工厂类)
		Product phone = ProductFactory.getProduct(ProductType.Phone);
		System.out.println(phone.getName());
		Product computer = ProductFactory.getProduct(ProductType.Computer);
		System.out.println(computer.getName());
		
	}
	
}
