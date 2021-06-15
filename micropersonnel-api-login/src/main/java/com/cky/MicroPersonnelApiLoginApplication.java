package com.cky;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wales
 * <p>
 * Micro Personnel Api Login
 */
@EnableFeignClients
@SpringCloudApplication
public class MicroPersonnelApiLoginApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroPersonnelApiLoginApplication.class, args);
    }
}
