package com.rohit.MyFirstAOPProject;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.rohit.MyFirstAOPProject")
@Configuration
@EnableAspectJAutoProxy
public class DemoApp {

}
