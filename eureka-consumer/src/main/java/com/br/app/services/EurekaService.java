package com.br.app.services;

import java.net.URI;
import java.time.Clock;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

@Service
public class EurekaService {

	@Autowired
	private DiscoveryClient discoveryClient;

	public URI getInstance(String serviceId) {

		discoveryClient.getServices().forEach(s -> System.out.println(s));
		List<ServiceInstance> instances = discoveryClient.getInstances(serviceId);

		if (instances != null && !instances.isEmpty()) {

			return instances.get(0).getUri();

		}

		return null;

	}

}
