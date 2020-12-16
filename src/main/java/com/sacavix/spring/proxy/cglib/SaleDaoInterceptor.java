package com.sacavix.spring.proxy.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class SaleDaoInterceptor implements MethodInterceptor {

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("Before execute method = " + arg3.getSuperName());
		Object res = arg3.invokeSuper(arg0, arg2);
		System.out.println("After execute method ....");
		return res;
	}

	

}
