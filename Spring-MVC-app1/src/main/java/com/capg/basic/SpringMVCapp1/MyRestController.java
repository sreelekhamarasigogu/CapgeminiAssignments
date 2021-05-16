package com.capg.basic.SpringMVCapp1;
import org.springFramework.web.bind.annotation.GetMapping;
import org.springFramework.web.bind.annotation.RestController;
public class MyRestController {
	public String sayHello() {
		return "Hello";
	}
}
