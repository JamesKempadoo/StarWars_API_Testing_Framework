package org.mtfbwy.spartanapi.framework_tester;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mtfbwy.spartanapi.framework.connection.ConnectionManager;
import org.mtfbwy.spartanapi.framework.dto.PeopleDTO;
import org.mtfbwy.spartanapi.framework.dto.PeopleRepository;
import org.mtfbwy.spartanapi.framework.injection.MockInjector;
import org.mtfbwy.spartanapi.framework.services.Endpoint;

public class PeopleTest {

    static PeopleDTO dto;
    static PeopleRepository dtoRepo;
    static String pathFileDTO = "src/test/resources/Mock_JSON_Data/DTO/PeopleMock.json";
    static String pathFileRepo = "src/test/resources/Mock_JSON_Data/Repo/PeopleRepoMock.json";

    @BeforeAll
    static void initSetup() {

        dto = MockInjector.injectPeopleDTO(pathFileDTO);
        dtoRepo = MockInjector.injectPeopleRepository(pathFileRepo);
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
    @DisplayName("Check if film 1 is in list")
    void checkIfFilm1InList(){
        Assertions.assertTrue(dto.checkIfIdExistsInList(Endpoint.FILMS, 1));
    }

    @Test
    @DisplayName("Check if  mass is not empty")
    void checkIfMassIsEmpty(){
        Assertions.assertFalse(dto.isMassEmpty());
    }
}
