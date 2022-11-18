package org.mtfbwy.spartanapi.regular_testing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class APITest {

    // Init

    private static HttpResponse<String> response;

    private static final ObjectMapper mapper = new ObjectMapper();

    private final ArrayList<String> validGenders = new ArrayList<>(List.of(new String[]{"male", "female", "unknown", "n/a"}));

    private static JsonNode node;

    @BeforeAll
    static void initSetup() {

        try {

            HttpClient client = HttpClient.newHttpClient();

            // Make Http Request and expose headers
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://swapi.dev/api/people/1"))
                    .build();

            response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Map response body to Json Node
            node = mapper.readTree(new URL("https://swapi.dev/api/people/1"));

        } catch(URISyntaxException | IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    @DisplayName("Test that Status Code is 200")
    void statusCode200Test() {

        Assertions.assertEquals(200, response.statusCode());
    }

    @Test
    @DisplayName("Testing the Server Header")
    void testForTheHeaders() {

        Assertions.assertEquals("nginx/1.16.1", response.headers().firstValue("Server").orElse("Server Not Found"));

    }

    @Test
    @DisplayName("Testing the Content Type header")
    void testForContentTypeHeader() {

        Assertions.assertEquals("application/json", response.headers().firstValue("content-type").orElse("Content Type not found"));

    }

    @Test
    @DisplayName("Printing the response body")
    void testForTheResponseBody() {
        System.out.println(response.body());
    }

    @Test
    @DisplayName("Test Gender Value is Valid")
    void testTheGenderIsValid() {

        String gender = node.get("gender").asText();

        Assertions.assertTrue(validGenders.contains(gender.toLowerCase()));
    }

    // Key
    @Test
    @DisplayName("Testing for the Height to be greater than 0")
    void testHeightIsGreaterThan0() {
        int height = node.get("height").asInt();

        Assertions.assertTrue(height > 0);
    }

    // Accessibility
    @Test
    @DisplayName("Testing for the Mass field to be greater than 0")
    void testMassFieldIsGreaterThan0() {

        double accessibility = node.get("mass").asDouble();

        Assertions.assertTrue(accessibility > 0);
    }

    // Price
    @Test
    @DisplayName("Testing the Eye Colour Length is Valid")
    void testEyeColourIsValid() {

        Assumptions.assumeFalse(node.get("eye_colour") == null);

        String eyeColour = node.get("eye_colour").asText();
        Assertions.assertTrue(eyeColour.length() > 0);
    }

    @Test
    @DisplayName("Test that HomeWorld is valid URL format")
    void testHomeWorldFormat() {

        String link = node.get("url").asText();

        Assumptions.assumeTrue(link.length() > 0);

        Assertions.assertTrue(isValidURL(link));
    }

    // URL
    @Test
    @DisplayName("Test that link is valid URL format")
    void testLinkFieldFormat() {

        String link = node.get("url").asText();

        Assumptions.assumeTrue(link.length() > 0);

        Assertions.assertTrue(isValidURL(link));
    }

    boolean isValidURL(String link) {
        try {
            new URL(link).toURI();
            return true;
        } catch (MalformedURLException | URISyntaxException e) {
            return false;
        }
    }
}
