package com.sacavix.spring.proxy.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@ComponentScan
@Configuration
public class SpringComponent {
	
	@Bean
	@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
	SpringBean springBean() {
	  return new SpringBean();
	}
	
	@Bean
	@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
	InterfaceBeanImpl interfaceBean() {
	  return new InterfaceBeanImpl();
	}
 
}
