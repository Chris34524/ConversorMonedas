package com.aluracursos.conversor.principal.modelos;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conexion {
    private String json;

    public Conexion(){
        String direccion = "https://v6.exchangerate-api.com/v6/8622c801bd51cfe2fae2ea67/latest/USD";
        String json;
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            this.json = response.body();
        }catch(Exception e){
            this.json = "Sin resultados!";
        }
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }
}
