package com.cursosdedesarrollo.springbootbeansfactories.beans.configuration;

class Conexion {
    private final String url;
    private Conexion(String url) { this.url = url; }
    public static Conexion crear(String url) { return new Conexion(url); }
    public String url() { return url; }
}
