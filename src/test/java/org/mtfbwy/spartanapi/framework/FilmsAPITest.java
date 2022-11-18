package org.mtfbwy.spartanapi.framework;

import io.cucumber.java.bs.A;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
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
    static String urlEndPointDTO = ConnectionManager.getConnection(Endpoint.FILMS, 1);
    static String urlEndPointRepo = ConnectionManager.getConnection(Endpoint.FILMS);

    @BeforeAll
    static void initSetup() {

        dto = Injector.injectFilmDTO(urlEndPointDTO);
        status = ConnectionManager.getStatusCode(urlEndPointDTO);
        System.out.println(status);
        dtoRepo = Injector.injectFilmRepository(urlEndPointRepo);
    }

    @Test
    @DisplayName("Check that has value 1")
    void checkThatHasValue1(){
        Assertions.assertTrue(dto.checkIfIdExistsInList(Endpoint.PEOPLE,1));
    }

    @Test
    @DisplayName("Check that starships has value of 2")
    void checkThatStarshipsHasValueOf2(){
        Assertions.assertTrue(dto.checkIfIdExistsInList(Endpoint.STARSHIPS,2));
    }

    @Test
    @DisplayName("Check that planets has value of 1")
    void checkThatPlanetsHasValueOf1(){
        Assertions.assertTrue(dto.checkIfIdExistsInList(Endpoint.PLANETS,1));
    }

    @Test
    @DisplayName("Check that vehicles has value of 4")
    void checkThatVehiclesHasValueOf4(){
        Assertions.assertTrue(dto.checkIfIdExistsInList(Endpoint.VEHICLES,4));
    }



}
