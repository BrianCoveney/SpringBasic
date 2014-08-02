package com.spring.tutorial;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainClass {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		AnnotationExample annotations = (AnnotationExample)context.getBean("annotations");
		annotations.playInstrument();
		
	}
}
	
		
		
//		Earlier in tutorial 6
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
//				"beans.xml");
//		InjectCollections collections = (InjectCollections)context.getBean("injectCollections");
//		System.out.println("List values " + collections.getIntegerList());
//		System.out.println("Set values " + collections.getIntegerSet());
//		System.out.println("Map values " + collections.getMap());
		
		
		
//		Earlier in tutorial 5
//		PlayInstrument playIt = (PlayInstrument)context.getBean("playInstrument");
//
//		playIt.playedInstrument();
		
		
		
		
//		Earlier in tutorial 4
//		SetterInjectionExample setterInjection = (SetterInjectionExample) context
//				.getBean("setterInjection");
//		System.out.println(setterInjection.getId());
//		System.out.println(setterInjection.getName());
		
		
//		Earlier in tutorial 3
//		LifecycleExample lifeCycle = (LifecycleExample) context
//				.getBean("lifeCycle");
//		lifeCycle.setName("Rocky");
//		lifeCycle.getName();
//		
//		context.registerShutdownHook();
		//context.close();
		

	
//		Earlier in tutorial 2 
//		springMessage1.setSpringMessage("Message from first object");
//		springMessage1.getSpringMessage();
//		
//		SpringMessage springMessage2 = (SpringMessage) context
//				.getBean("springMessage");
//		springMessage2.setSpringMessage("Message from second object");
//		springMessage2.getSpringMessage();
		
		


//		Earlier in tutorial 1
//		SpringConstructorInjection constructorInjection = (SpringConstructorInjection) context
//				.getBean("constructorInjection");
//		constructorInjection.showInjectedValues();
//	}
//
//}
