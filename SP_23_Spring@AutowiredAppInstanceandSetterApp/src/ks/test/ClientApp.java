package ks.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ks.comp.Flipkart;

public class ClientApp {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("ks/cfg/applicationContext.xml");

		Flipkart flipkart = context.getBean(Flipkart.class);
		System.out.println(flipkart.doShopping(new String[] { "tissot", "omegha" }, 
				                               new float[] { 35000.46f, 600000.50f }));

		((AbstractApplicationContext) context).close();
	}
}

