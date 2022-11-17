package org.mtfbwy.spartanapi.framework.connection;

import org.mtfbwy.spartanapi.framework.services.Endpoint;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConnectionManager  {
    private static final String BASEURL = "https://swapi.dev/api/";

    public static String getConnection(){
        return BASEURL;
    }

//    public static String getConnection(enum endpoint){
//        String result = (BASEURL + endpoint.value());
//        return result;
//    }

    public static String getConnection(Endpoint endpoint, String key, String value) {
        return BASEURL + endpoint.label + "" + "?" + key + "=" + value;
    }

    public static String getConnection(Endpoint endpoint, String key, int value) {
        return BASEURL + endpoint.label + "" + "?" + key + "=" + value;
    }

    private static HttpResponse<String> getResponse(){
        var client = HttpClient.newHttpClient();
        var request = HttpRequest
                .newBuilder()
                .uri(URI.create(BASEURL))
                .build();
        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return response;
    }

    public static int getStatusCode(){
        return getResponse().statusCode();
    }

    public static String getHeader(String key){

        return getResponse()
                .headers()
                .firstValue(key)
                .orElse("Key Not Found");
    }
}
