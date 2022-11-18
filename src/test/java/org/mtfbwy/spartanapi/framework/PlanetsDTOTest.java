package org.mtfbwy.spartanapi.framework;

import org.junit.jupiter.api.*;
import org.mtfbwy.spartanapi.framework.connection.ConnectionManager;
import org.mtfbwy.spartanapi.framework.dto.PlanetsDTO;
import org.mtfbwy.spartanapi.framework.dto.PlanetsRepository;
import org.mtfbwy.spartanapi.framework.injection.Injector;
import org.mtfbwy.spartanapi.framework.services.Endpoint;


public class PlanetsDTOTest {

    static PlanetsDTO dto;
    static PlanetsRepository dtoRepo;
    static int status;
    static String urlEndPointDTO = ConnectionManager.getConnection(Endpoint.PLANETS, 6);
    static String urlEndPointRepo = ConnectionManager.getConnection(Endpoint.PLANETS);

    @BeforeAll
    static void initSetup() {

        dto = Injector.injectPlanetsDTO(urlEndPointDTO);
        status = ConnectionManager.getStatusCode(urlEndPointDTO);
        System.out.println(status);
        dtoRepo = Injector.injectPlanetRepository(urlEndPointRepo);
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


    @Nested
    class PlanetsRepositoryTests {

        @Test
        @DisplayName("Testing the count of results equals the length of results array")
        void testCountOfResults() {
            Assertions.assertTrue(dtoRepo.checkResultsCountIsValid());
        }
    }
}
