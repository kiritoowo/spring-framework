package com.ljm.main;

import com.ljm.config.TestConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description TODO
 * @Author ljm
 * @Date 2021/4/7 16:38
 */
public class Main {
	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestConfig.class);

	}
}
