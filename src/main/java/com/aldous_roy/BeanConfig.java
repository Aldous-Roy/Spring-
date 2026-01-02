package com.aldous_roy;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.aldous_roy")
@EnableAspectJAutoProxy
public class BeanConfig {

}
