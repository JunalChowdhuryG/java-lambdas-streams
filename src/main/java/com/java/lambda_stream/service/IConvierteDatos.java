package com.java.lambda_stream.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
