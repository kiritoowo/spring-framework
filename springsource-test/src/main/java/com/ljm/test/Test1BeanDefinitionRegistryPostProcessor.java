package com.ljm.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author ljm
 * @Date 2021/9/14 14:55
 */
@Component
public class Test1BeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	public Test1BeanDefinitionRegistryPostProcessor() {
		System.out.println("Test1BeanDefinitionRegistryPostProcessor");
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
		System.out.println("Test1BeanDefinitionRegistryPostProcessor postProcessBeanFactory");
	}

	/**
	 * Modify the application context's internal bean definition registry after its
	 * standard initialization. All regular bean definitions will have been loaded,
	 * but no beans will have been instantiated yet. This allows for adding further
	 * bean definitions before the next post-processing phase kicks in.
	 *
	 * @param registry the bean definition registry used by the application context
	 * @throws BeansException in case of errors
	 */
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("Test1BeanDefinitionRegistryPostProcessor postProcessBeanDefinitionRegistry");
	}
}
