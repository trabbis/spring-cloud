package com.duksun.spring.cloud.duksundataflowserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.dataflow.server.EnableDataFlowServer;

@EnableDataFlowServer
@SpringBootApplication
public class DuksunDataFlowServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DuksunDataFlowServerApplication.class, args);
	}

}
