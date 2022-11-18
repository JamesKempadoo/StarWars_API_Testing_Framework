package org.mtfbwy.spartanapi.framework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mtfbwy.spartanapi.framework.connection.ConnectionManager;
import org.mtfbwy.spartanapi.framework.dto.PeopleDTO;
import org.mtfbwy.spartanapi.framework.dto.PeopleRepository;
import org.mtfbwy.spartanapi.framework.injection.Injector;
import org.mtfbwy.spartanapi.framework.services.Endpoint;


public class PeopleDTOTest {

    static PeopleDTO dto;
    static PeopleRepository dtoRepo;
    static int status;
    static String urlEndPointDTO = ConnectionManager.getConnection(Endpoint.PEOPLE, 6);
    static String urlEndPointRepo = ConnectionManager.getConnection(Endpoint.PEOPLE);

    @BeforeAll
    static void initSetup() {

        dto = Injector.injectPeopleDTO(urlEndPointDTO);
        status = ConnectionManager.getStatusCode(urlEndPointDTO);
        System.out.println(status);
        dtoRepo = Injector.injectPeopleRepository(urlEndPointRepo);
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
