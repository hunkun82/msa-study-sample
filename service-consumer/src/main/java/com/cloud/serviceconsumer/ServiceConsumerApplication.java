package com.cloud.serviceconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.cloud.serviceconsumer")
@EnableDiscoveryClient
public class ServiceConsumerApplication {

  public static void main(String[] args) {
    SpringApplication.run(ServiceConsumerApplication.class, args);
  }

}
