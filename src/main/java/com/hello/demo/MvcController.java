package com.hello.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController {
	@RequestMapping ("/Hello")
             public String sayhello() {
            	 System.out.println("say hello");
             return"Home";
             }
}
