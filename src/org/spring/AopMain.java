package org.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.service.FactoryService;
import org.service.ShapeService;

public class AopMain {
	
	public static void main(String[] args) {
		
		FactoryService factoryService = new FactoryService();
		ShapeService shapeService = (ShapeService) factoryService.getBean("shapeService");
		shapeService.getCircle();
		
		
	} 

}
