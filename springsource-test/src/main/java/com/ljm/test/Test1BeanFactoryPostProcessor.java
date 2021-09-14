package com.ljm.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author ljm
 * @Date 2021/9/14 14:54
 */
@Component
public class Test1BeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	public Test1BeanFactoryPostProcessor() {
		System.out.println("Test1BeanFactoryPostProcessor");
	}
	/**
	 * Modify the application context's internal bean factory after its standard
	 * initialization. All bean definitions will have been loaded, but no beans
	 * will have been instantiated yet. This allows for overriding or adding
	 * properties even to eager-initializing beans.
	 *
	 * @param beanFactory the bean factory used by the application context
	 * @throws BeansException in case of errors
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Test1BeanFactoryPostProcessor postProcessBeanFactory");
	}


}
