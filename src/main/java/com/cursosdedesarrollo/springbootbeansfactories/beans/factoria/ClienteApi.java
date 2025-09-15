package com.cursosdedesarrollo.springbootbeansfactories.beans.factoria;

import org.springframework.stereotype.Service;

import java.net.http.HttpClient;

@Service
class ClienteApi {
    private final java.net.http.HttpClient http;

    public ClienteApi(HttpClient http) { // inyecta el producido por FactoryBean
        this.http = http;
    }
}

