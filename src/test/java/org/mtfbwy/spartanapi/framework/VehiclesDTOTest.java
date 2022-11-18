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

    static ObjectMapper mapper = new ObjectMapper();

    @BeforeAll
    static void initSetup() {

        dto = Injector.injectVehiclesDTO(ConnectionManager.getConnection(Endpoint.VEHICLES, 6));
        status = ConnectionManager.getStatusCode(ConnectionManager.getConnection(Endpoint.VEHICLES, 6));
        System.out.println(status);

//        try {
//            dtoRepo = mapper.readValue(new URL(ConnectionManager.getConnection(Endpoint.VEHICLES)), VehiclesRepository.class);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
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
