package com.wiley.springcore.factorymethods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration("/factorymethod/instance-config.xml")
public class InstanceFooFactoryIntegrationTest {

    @Autowired
    private Foo foo;
    
	/*
	 * @Test public void
	 * givenValidInstanceFactoryConfig_whenCreateFooInstance_thenInstanceIsNotNull()
	 * { assertNotNull(foo); }
	 */
}
