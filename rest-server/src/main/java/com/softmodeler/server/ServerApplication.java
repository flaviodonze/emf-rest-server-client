package com.softmodeler.server;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.cxf.Bus;
import org.apache.cxf.common.util.StringUtils;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.ext.logging.event.LogEvent;
import org.apache.cxf.ext.logging.event.PrintWriterEventSender;
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
	public Server rsServer() throws Exception {
		List<Object> providers = new ArrayList<>(CommunicationUtil.getProviders());
		providers.add(new ServerExceptionMapper());
		
		JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
		endpoint.setProviders(providers);
		endpoint.setBus(bus);
		endpoint.setServiceBeans(Arrays.<Object>asList(new POJOServiceImpl(), new NotificationDefinitionServiceImpl(),
				new TreeNodeServiceImpl()));
		endpoint.setAddress("/");
//		endpoint.setFeatures(Arrays.asList(createOpenApiFeature(), new LoggingFeature()));
		endpoint.setFeatures(Arrays.asList(loggingFeature()));
		return endpoint.create();
	}

	private LoggingFeature loggingFeature() throws FileNotFoundException {
//		return new LoggingFeature();

		// logger which is focused on comparing transfer data e.g. after an update of framework
		LoggingFeature loggingFeature = new LoggingFeature();
		PrintWriter writer = new PrintWriter("d:/temp/server.txt");
		loggingFeature.setSender(new PrintWriterEventSender(writer) {
		    /** {@inheritDoc}*/
		    @Override
		    public void send(LogEvent event) {
		        synchronized (writer) {
//		            writer.print(Instant.now().toString() + " - PrintWriterEventSender - ");
		            writer.print(format(event));
		            writer.flush();
		        }
		    }
		    
		    public String format(LogEvent event) {
		        StringBuilder b = new StringBuilder();
		        // Start from the next line to have the output well-aligned
		        b.append(event.getType()).append('\n');
		        
		        write(b, "Address", event.getAddress());
		        write(b, "HttpMethod", event.getHttpMethod());
		        write(b, "Content-Type", event.getContentType());
		        write(b, "ResponseCode", event.getResponseCode());
//		        write(b, "ExchangeId", event.getExchangeId());
		        if (event.getServiceName() != null) {
//		            write(b, "ServiceName", localPart(event.getServiceName()));
//		            write(b, "PortName", localPart(event.getPortName()));
//		            write(b, "PortTypeName", localPart(event.getPortTypeName()));
		        }
		        if (event.getFullContentFile() != null) {
		            write(b, "FullContentFile", event.getFullContentFile().getAbsolutePath());
		        }

		        Map<String, String> headers = event.getHeaders();
		        headers.remove("Date");

				write(b, "Headers", headers.toString());
		        if (!StringUtils.isEmpty(event.getPayload())) {
		            write(b, "Payload", event.getPayload());
		        }
		        return b.toString();
		    }

		    protected void write(StringBuilder b, String key, String value) {
		        if (value != null) {
		            b.append("    ").append(key).append(": ").append(value).append('\n');
		        }
		    }
		    
		});
		return loggingFeature;
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
