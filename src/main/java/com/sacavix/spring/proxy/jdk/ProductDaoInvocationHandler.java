package com.sacavix.spring.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProductDaoInvocationHandler implements InvocationHandler {
	
	private final ProductDao target;
	
	public ProductDaoInvocationHandler(ProductDao target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Before execute method = " + method.getName());
		Object res = method.invoke(target, args);
		System.out.println("After execute method ....");
		return res;
	}

}
