package org.mtfbwy.spartanapi.framework;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mtfbwy.spartanapi.framework.connection.ConnectionManager;
import org.mtfbwy.spartanapi.framework.dto.FilmDTO;
import org.mtfbwy.spartanapi.framework.dto.FilmsRepository;
import org.mtfbwy.spartanapi.framework.dto.VehiclesDTO;
import org.mtfbwy.spartanapi.framework.dto.VehiclesRepository;
import org.mtfbwy.spartanapi.framework.injection.Injector;
import org.mtfbwy.spartanapi.framework.services.Endpoint;

import java.io.IOException;
import java.net.URL;

public class VehiclesDTOTest {

    static VehiclesDTO dto;
    static VehiclesRepository dtoRepo;
    static int status;
    static String urlEndPointDTO = ConnectionManager.getConnection(Endpoint.VEHICLES, 6);
    static String urlEndPointRepo = ConnectionManager.getConnection(Endpoint.VEHICLES);

    @BeforeAll
    static void initSetup() {

        dto = Injector.injectVehiclesDTO(urlEndPointDTO);
        status = ConnectionManager.getStatusCode(urlEndPointDTO);
        System.out.println(status);
        dtoRepo = Injector.injectVehiclesRepository(urlEndPointRepo);
    }

    @Test
    @DisplayName("Check If Vehicle Was part Of Film with particular id")
    void checkIfVehicleWasPartOfFilm1() {
        Assertions.assertTrue(dto.checkIfIdExistsInList(Endpoint.FILMS, 1));
    }

    @Test
    @DisplayName("Check if Name is capitalized")
    void checkIfNameIsCapitalized(){
        Assertions.assertTrue(dto.isNameCapitalized());
    }

    @Test
    @DisplayName("Check if Model is Empty")
    void checkIfModelIsEmpty(){
        Assertions.assertFalse(dto.isModelEmpty());
    }

}
