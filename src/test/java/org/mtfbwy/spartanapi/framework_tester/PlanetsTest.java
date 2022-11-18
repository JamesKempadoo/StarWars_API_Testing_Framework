package org.mtfbwy.spartanapi.framework_tester;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mtfbwy.spartanapi.framework.connection.ConnectionManager;
import org.mtfbwy.spartanapi.framework.dto.PlanetsDTO;
import org.mtfbwy.spartanapi.framework.dto.PlanetsRepository;
import org.mtfbwy.spartanapi.framework.injection.MockInjector;

public class PlanetsTest {

    static PlanetsDTO dto;
    static PlanetsRepository dtoRepo;
    static String pathFileDTO = "src/test/resources/Mock_JSON_Data/DTO/PlanetMock.json";
    static String pathFileRepo = "src/test/resources/Mock_JSON_Data/Repo/PlanetMock.json";

    @BeforeAll
    static void initSetup() {

        dto = MockInjector.injectPlanetsDTO(pathFileDTO);
        dtoRepo = MockInjector.injectPlanetRepository(pathFileRepo);
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
