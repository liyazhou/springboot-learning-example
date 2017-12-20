package org.spring.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Spring Boot HelloWorld 案例
 *
 * Created by bysocket on 16/4/26.
 */
@RestController
public class HelloWorldController {
    //    http://localhost:8080
    @RequestMapping("/")
    public String sayHello() {
        return "Hello,World!";
    }

    //    http://localhost:8080/test
    @RequestMapping("/test")
    public String test(HttpServletRequest request) {
        return request.getRequestURL().toString();
    }
}
