package com.softmodeler.server;

import java.util.Arrays;

import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.openapi.OpenApiFeature;
import org.apache.cxf.jaxrs.swagger.ui.SwaggerUiConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.softmodeler.common.communication.CommunicationUtil;
import com.softmodeler.service.impl.NotificationDefinitionServiceImpl;
import com.softmodeler.service.impl.POJOServiceImpl;
import com.softmodeler.service.impl.TreeNodeServiceImpl;

@SpringBootApplication
public class ServerApplication {
	@Autowired
	private Bus bus;

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	public Server rsServer() {
		JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
		endpoint.setProviders(CommunicationUtil.getProviders());
		endpoint.setBus(bus);
		endpoint.setServiceBeans(Arrays.<Object>asList(new POJOServiceImpl(), new NotificationDefinitionServiceImpl(),
				new TreeNodeServiceImpl()));
		endpoint.setAddress("/");
		endpoint.setFeatures(Arrays.asList(createOpenApiFeature(), new LoggingFeature()));
		return endpoint.create();
	}

	@Bean
	public OpenApiFeature createOpenApiFeature() {
		final OpenApiFeature openApiFeature = new OpenApiFeature();
		openApiFeature.setPrettyPrint(true);
		openApiFeature.setTitle("Spring Boot CXF REST Application");
		openApiFeature.setContactName("The Apache CXF team");
		openApiFeature.setDescription("This sample project demonstrates how to use CXF JAX-RS services"
				+ " with Spring Boot. This demo has two JAX-RS class resources being"
				+ " deployed in a single JAX-RS endpoint.");
		openApiFeature.setVersion("1.0.0");
		openApiFeature.setSwaggerUiConfig(new SwaggerUiConfig().url("/services/openapi.json"));
		return openApiFeature;
	}
}
