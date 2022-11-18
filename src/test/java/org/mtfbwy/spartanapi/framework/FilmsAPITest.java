package org.mtfbwy.spartanapi.framework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mtfbwy.spartanapi.framework.connection.ConnectionManager;
import org.mtfbwy.spartanapi.framework.dto.FilmDTO;
import org.mtfbwy.spartanapi.framework.dto.FilmsRepository;
import org.mtfbwy.spartanapi.framework.injection.Injector;
import org.mtfbwy.spartanapi.framework.services.Endpoint;

public class FilmsAPITest {

    static FilmDTO dto;
    static FilmsRepository dtoRepo;
    static int status;
    static String urlEndPointDTO = ConnectionManager.getConnection(Endpoint.FILMS, 6);
    static String urlEndPointRepo = ConnectionManager.getConnection(Endpoint.FILMS);

    @BeforeAll
    static void initSetup() {

        dto = Injector.injectFilmDTO(urlEndPointDTO);
        status = ConnectionManager.getStatusCode(urlEndPointDTO);
        System.out.println(status);
        dtoRepo = Injector.injectFilmRepository(urlEndPointRepo);
    }

    @Test
    void testRun() {
        //System.out.println(dto.toString());

        System.out.println(dtoRepo);

        // Checking that actor exists in PEOPLE endpoint
        Assertions.assertTrue(dto.checkIfIdExistsInList(Endpoint.PEOPLE, 1));


    }


}
