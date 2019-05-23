package com.compras.backend.rest.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ComprasBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComprasBackendApplication.class, args);
    }

}
