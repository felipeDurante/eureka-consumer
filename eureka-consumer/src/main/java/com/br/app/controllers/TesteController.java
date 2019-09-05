package com.br.app.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.br.app.services.EurekaService;

@RestController
public class TesteController {

	@Autowired
	private EurekaService service;

	@GetMapping(value = "/getServiceName/{serviceName}")
	public URI coco(@PathVariable("serviceName") String serviceName) {

		System.out.println(serviceName);
		System.out.println("get serice nome" + service.getInstance(serviceName));
		return service.getInstance(serviceName);
	}
}
