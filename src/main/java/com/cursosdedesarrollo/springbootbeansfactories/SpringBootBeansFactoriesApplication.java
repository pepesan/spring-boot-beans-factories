package com.cursosdedesarrollo.springbootbeansfactories;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBeansFactoriesApplication {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(SpringBootBeansFactoriesApplication.class, args);
        // SpringApplication.exit(ctx); // fuerza cierre para ver @PreDestroy/destroy
    }

}
