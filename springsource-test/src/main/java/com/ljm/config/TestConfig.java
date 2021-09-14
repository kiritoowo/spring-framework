package com.ljm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description TODO
 * @Author ljm
 * @Date 2021/4/7 18:22
 */
@Configuration
@ComponentScan(basePackages = "com.ljm")
@EnableAspectJAutoProxy
public class TestConfig {

}
