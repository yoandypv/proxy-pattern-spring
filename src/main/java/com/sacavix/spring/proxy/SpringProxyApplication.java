package com.sacavix.spring.proxy;

import java.lang.reflect.Proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.proxy.Enhancer;

import com.sacavix.spring.proxy.cglib.Sale;
import com.sacavix.spring.proxy.cglib.SaleDao;
import com.sacavix.spring.proxy.cglib.SaleDaoInterceptor;
import com.sacavix.spring.proxy.jdk.Product;
import com.sacavix.spring.proxy.jdk.ProductDao;
import com.sacavix.spring.proxy.jdk.ProductDaoImpl;
import com.sacavix.spring.proxy.jdk.ProductDaoInvocationHandler;

@SpringBootApplication
public class SpringProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProxyApplication.class, args);
		
		// --- JDK PROXY 
		
		ProductDao productDao = (ProductDao) Proxy.newProxyInstance(ProductDao.class.getClassLoader(),
				ProductDaoImpl.class.getInterfaces(), 
				new ProductDaoInvocationHandler(new ProductDaoImpl())
				);
		
		Product p1 = productDao.findById(5L);
		Product p2 = productDao.save(p1);
		
		System.out.println("\n\n ============== \n\n");
		// --- CGLib PROXY
		
		Enhancer enhancer = new Enhancer();
		enhancer.setCallback(new SaleDaoInterceptor());
		enhancer.setSuperclass(SaleDao.class);
		SaleDao saleDao = (SaleDao) enhancer.create();
		
		Sale s1 = saleDao.findById(7L);
		Sale s2 = saleDao.save(s1);
		
	}

}
