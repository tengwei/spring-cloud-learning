package org.tw.provider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Provider2ServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(Provider2ServiceApplication.class, args);
    }
}
