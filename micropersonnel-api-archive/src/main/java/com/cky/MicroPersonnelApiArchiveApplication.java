package com.cky;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringCloudApplication
public class MicroPersonnelApiArchiveApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroPersonnelApiArchiveApplication.class, args);
    }
}
