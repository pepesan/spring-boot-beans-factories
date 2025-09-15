package com.cursosdedesarrollo.springbootbeansfactories.beans.registrodinamico;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

// Uso: activa perfil dev y obtén mensajeDinamico del contexto.
@Configuration
@Profile("dev")
class RegistroDinamicoConfig implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        var bd = BeanDefinitionBuilder
                .genericBeanDefinition(String.class, () -> "registrado-dinamicamente")
                .getBeanDefinition();
        registry.registerBeanDefinition("mensajeDinamico", bd);
    }
    @Override
    public void postProcessBeanFactory(org.springframework.beans.factory.config.ConfigurableListableBeanFactory bf) {}
}

