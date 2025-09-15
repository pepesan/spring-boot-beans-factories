package com.cursosdedesarrollo.springbootbeansfactories.beans.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ConexionConfig {
    @Bean
    public Conexion conexionPrincipal() {
        return Conexion.crear("jdbc:postgresql://localhost:5432/app");
    }
}
