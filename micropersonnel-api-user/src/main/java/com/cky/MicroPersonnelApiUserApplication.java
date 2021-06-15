package com.cky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringCloudApplication
public class MicroPersonnelApiUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroPersonnelApiUserApplication.class,args);
    }

}
