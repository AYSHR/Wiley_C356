package com.wiley.springcore.factorymethods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration("/factorymethod/instance-bar-config.xml")
public class InstanceBarFactoryIntegrationTest {

    @Autowired
    private Bar instance;
    
	/*
	 * @Test public void
	 * givenValidInstanceFactoryConfig_whenCreateInstance_thenNameIsCorrect() {
	 * assertNotNull(instance); assertEquals("someName", instance.getName()); }
	 */
}
