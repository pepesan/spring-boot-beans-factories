package com.cursosdedesarrollo.springbootbeansfactories.beans.condicionales;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

// Habilitar feature.x.enabled=true (propiedades o env)
// Activar perfil: --spring.profiles.active=dev o prod
@Configuration
public class CondicionalConfig {

    @Bean
    @Conditional(OnFeatureXEnabled.class)
    public String beanSoloSiFeatureX() {
        return "activo";
    }

    @Bean
    @Profile("dev")
    public String beanSoloDev() {
        return "solo-dev";
    }

    @Bean
    @Profile("prod")
    public String beanSoloProd() {
        return "solo-prod";
    }
}

