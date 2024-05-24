package com.aluracursos.conversordemonedas.tareas;

import com.aluracursos.conversordemonedas.modelos.Conversion;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {

    public Conversion busquedaConversion(String monedaConvertir, String monedaAConvertir , double valorAConvertir){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/127079e5c0cc2ea62014bcfa/pair/" +
                        monedaConvertir + "/" + monedaAConvertir + "/" + valorAConvertir);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversion.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
