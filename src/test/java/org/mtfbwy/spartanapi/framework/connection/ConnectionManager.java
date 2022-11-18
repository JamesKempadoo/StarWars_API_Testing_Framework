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

    public static String getConnection(Endpoint endpoint){
        String result = (BASEURL + endpoint.label);
        return result;
    }

    public static String getConnection(Endpoint endpoint, String secondaryEndpoint){
        String result = (BASEURL + endpoint.label + "/" + secondaryEndpoint);
        return result;
    }

    public static String getConnection(Endpoint endpoint, int secondaryEndpoint){
        String result = (BASEURL + endpoint.label + "/" + secondaryEndpoint);
        return result;
    }


    public static String getConnection(Endpoint endpoint, String key, String value) {
        return BASEURL + endpoint.label + "" + "?" + key + "=" + value;
    }

    public static String getConnection(Endpoint endpoint, String key, int value) {
        return BASEURL + endpoint.label + "" + "?" + key + "=" + value;
  
    }

    private static HttpResponse<String> getResponse(String path){
        var client = HttpClient.newHttpClient();
        var request = HttpRequest
                .newBuilder()
                .uri(URI.create(path))
                .build();
        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return response;
    }

    public static int getStatusCode(String path){
        return getResponse(path).statusCode();
    }

    // Return Status Code of BASE URL ONLY
    public static int getBaseURLStatusCode() {
        return getStatusCode(BASEURL);
    }

    public static String getHeader(String path, String key){

        return getResponse(path)
                .headers()
                .firstValue(key)
                .orElse("Key Not Found");
    }
}
