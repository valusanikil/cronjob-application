package org.example.ws;

import org.example.ws.Application;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootConfiguration()
public abstract class AbstractTest {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

}