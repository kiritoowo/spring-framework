package com.ljm.config;

import com.ljm.pojo.Person;
import com.ljm.pojo.PersonTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @Author ljm
 * @Date 2021/4/7 18:22
 */
@Configuration(proxyBeanMethods = true)
public class TestConfig {

	@Bean
	public Person person() {
		Person person = new Person();
		person.setName("ljm");
		return person;
	}

	@Bean
	public PersonTest personTest() {
		PersonTest personTest = new PersonTest();
		Person person = person();
		return personTest;
	}
}
