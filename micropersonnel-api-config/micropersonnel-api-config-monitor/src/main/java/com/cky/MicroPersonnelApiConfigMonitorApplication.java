package com.cky;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author wales
 * <p>
 * Micro Personnel Monitors Server Application
 */
@EnableAdminServer
@SpringCloudApplication
public class MicroPersonnelApiConfigMonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroPersonnelApiConfigMonitorApplication.class, args);
    }
}
