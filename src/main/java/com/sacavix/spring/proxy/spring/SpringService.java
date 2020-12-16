package com.sacavix.spring.proxy.spring;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@ComponentScan
@Configuration
public class SpringService {
	
	@Autowired
	private SpringBean springBean;
	
	@Autowired
	private InterfaceBean interfaceBean;
	
	@Autowired
	private ApplicationContext context;

	@PostConstruct
	public void init() {
		System.out.println(context.getBean("springBean").getClass());
		System.out.println(context.getBean("interfaceBean").getClass());
	}

}
