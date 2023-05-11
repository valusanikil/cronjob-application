package org.example.ws.service;

import java.util.Collection;

import org.example.ws.AbstractTest;
import org.example.ws.model.Greeting;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class GreetingServiceTest extends AbstractTest {

    @Autowired
    private GreetingService service;

    @Before
    public void setUp() {
        service.evictCache();
    }

    @After
    public void tearDown() {
        // clean up after each test method
    }

    @Test
    public void testFindAll() {

        Collection<Greeting> list = service.findAll();

        Assert.assertNotNull("failure - expected not null", list);
        Assert.assertEquals("failure - expected list size", 3, list.size());

    }

}