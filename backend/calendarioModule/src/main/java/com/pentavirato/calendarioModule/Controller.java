package com.pentavirato.calendarioModule;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hola")
	public String getHello() {
		return "Hola";
	}
}