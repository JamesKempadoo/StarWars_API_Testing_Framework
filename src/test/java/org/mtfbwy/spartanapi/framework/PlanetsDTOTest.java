package org.mtfbwy.spartanapi.framework;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mtfbwy.spartanapi.framework.connection.ConnectionManager;
import org.mtfbwy.spartanapi.framework.dto.PlanetsDTO;
import org.mtfbwy.spartanapi.framework.dto.VehiclesDTO;
import org.mtfbwy.spartanapi.framework.dto.VehiclesRepository;
import org.mtfbwy.spartanapi.framework.injection.Injector;
import org.mtfbwy.spartanapi.framework.services.Endpoint;

import java.io.IOException;
import java.net.URL;

public class PlanetsDTOTest {

    static PlanetsDTO dto;

    static VehiclesRepository dtoRepo;
    static int status;

    static ObjectMapper mapper = new ObjectMapper();

    @BeforeAll
    static void initSetup() {
        String path = ConnectionManager.getConnection(Endpoint.PLANETS, 6);
        dto = Injector.injectPlanetsDTO(path);
        status = ConnectionManager.getStatusCode(path);
        System.out.println(status);

        try {
            dtoRepo = mapper.readValue(new URL(ConnectionManager.getConnection(Endpoint.VEHICLES)), VehiclesRepository.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("check if films link are correct format")
    void checkIfFilmsLinkAreCorrectFormat() {
        Assertions.assertTrue(dto.isFilmsLinkFormat());
    }

    @Test
    @DisplayName("Check if Name is capitalized")
    void checkIfNameIsCapitalized(){
        Assertions.assertTrue(dto.isNameCapitalized());
    }

    @Test
    @DisplayName("Check if name is null")
    void checkIfNameIsNull(){
        Assertions.assertFalse(dto.isNameNull());
    }

    @Test
    @DisplayName("Check if rotation period is bigger than 0")
    void checkIfRotationPeriodIsBiggerThan0(){
        Assertions.assertTrue(dto.isRotationPeriodBigger0());
    }

    @Test
    @DisplayName("Check if  climate is not empty")
    void checkIfClimateIsEmpty(){
        Assertions.assertFalse(dto.isClimateEmpty());
    }

    @Test
    @DisplayName("Check if gravity value/'s are Bigger 0")
    void checkIfGravityValueSAreBigger0(){
        Assertions.assertFalse(dto.isGravityValuesSmaller0());
    }
}
