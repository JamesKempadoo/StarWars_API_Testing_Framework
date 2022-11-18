package org.mtfbwy.spartanapi.framework_tester;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mtfbwy.spartanapi.framework.connection.ConnectionManager;
import org.mtfbwy.spartanapi.framework.dto.StarshipDTO;
import org.mtfbwy.spartanapi.framework.dto.StarshipsRepository;
import org.mtfbwy.spartanapi.framework.injection.MockInjector;
import org.mtfbwy.spartanapi.framework.services.Endpoint;

public class StarshipTest {

    static StarshipDTO dto;
    static StarshipsRepository dtoRepo;
    static String pathFileDTO = "src/test/resources/Mock_JSON_Data/DTO/StarshipMock.json";
    static String pathFileRepo = "src/test/resources/Mock_JSON_Data/Repo/StarshipRepoMock.json";



    @BeforeAll
    static void setup(){
        dto = MockInjector.injectStarshipDTO(pathFileDTO);
        dtoRepo = MockInjector.injectStarshipsRepository(pathFileRepo);
    }

    @Test
    @DisplayName("Check that the ship length is bigger than 0")
    void checkThatTheShipLengthIsBiggerThan0(){
        Assertions.assertTrue(dto.isShipLengthValid());
    }

    @Test
    @DisplayName("Check that the cargo capacity is bigger than 0")
    void checkThatTheCargoCapacityIsBiggerThan0(){
        Assertions.assertTrue(dto.isCargoCapacityValid());
    }

    @Test
    @DisplayName("Check that the model is not empty")
    void checkThatTheModelIsNotEmpty(){
        Assertions.assertTrue(dto.modelIsNotEmpty());
    }

    @Test
    @DisplayName("Check that name is not empty")
    void checkThatNameIsNotEmpty(){
        Assertions.assertTrue(dto.nameIsNotEmpty());
    }
    @Test
    @DisplayName("Check that crew is bigger than 0")
    void checkThatCrewIsBiggerThan0(){
        Assertions.assertTrue(dto.isCrewValid());
    }

    @Test
    @DisplayName("Check film Url are correct to api")
    void checkFilmUrlAreCorrectToApi(){
        Assertions.assertTrue(dto.isUrlAccurate());
    }
}
