package com.ljm.pojo;

import lombok.Data;

/**
 * @Description TODO
 * @Author ljm
 * @Date 2021/4/7 16:40
 */
@Data
public class Person {
	public Person() {
		System.out.println("create Person");
	}

	String name;
}
