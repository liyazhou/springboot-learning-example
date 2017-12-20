package org.spring.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Spring Boot HelloWorldController 测试 - {@link HelloWorldController}
 *
 * Created by bysocket on 16/4/26.
 */
public class HelloWorldControllerTest {

    @Test
    public void testSayHello() {
        assertEquals("Hello,World!",new HelloWorldController().sayHello());
//        assertNotNull("Hello,World!",new HelloWorldController().test());
    }
}
