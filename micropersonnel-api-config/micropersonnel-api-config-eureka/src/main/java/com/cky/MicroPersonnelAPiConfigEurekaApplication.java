package com.cky;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wales
 * <p>
 * Micro Personnel Eureka Server Application
 */
@EnableEurekaServer
@SpringCloudApplication
public class MicroPersonnelAPiConfigEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroPersonnelAPiConfigEurekaApplication.class, args);
    }
}
