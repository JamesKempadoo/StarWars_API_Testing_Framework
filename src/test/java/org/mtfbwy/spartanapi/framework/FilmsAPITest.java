package org.mtfbwy.spartanapi.framework;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mtfbwy.spartanapi.framework.connection.ConnectionManager;
import org.mtfbwy.spartanapi.framework.dto.FilmDTO;
import org.mtfbwy.spartanapi.framework.dto.FilmsRepository;
import org.mtfbwy.spartanapi.framework.injection.Injector;
import org.mtfbwy.spartanapi.framework.services.Endpoint;

import java.io.IOException;
import java.net.URL;

public class FilmsAPITest {

    static FilmDTO dto;

    static FilmsRepository dtoRepo;
    static int status;

    static ObjectMapper mapper = new ObjectMapper();

    @BeforeAll
    static void initSetup() {

        dto = Injector.injectFilmDTO(ConnectionManager.getConnection(Endpoint.FILMS, 1));
        status = ConnectionManager.getStatusCode();
        System.out.println(status);

        try {
            dtoRepo = mapper.readValue(new URL(ConnectionManager.getConnection(Endpoint.FILMS)), FilmsRepository.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testRun() {
        //System.out.println(dto.toString());

        System.out.println(dtoRepo);

        // Checking that actor exists in PEOPLE endpoint
        Assertions.assertTrue(dto.checkIfIdExistsInList(Endpoint.PEOPLE, 1));


    }


}
