package org.mtfbwy.spartanapi.framework_tester;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mtfbwy.spartanapi.framework.connection.ConnectionManager;
import org.mtfbwy.spartanapi.framework.dto.VehiclesDTO;
import org.mtfbwy.spartanapi.framework.dto.VehiclesRepository;
import org.mtfbwy.spartanapi.framework.injection.MockInjector;
import org.mtfbwy.spartanapi.framework.services.Endpoint;

public class VehiclesTest {

    static VehiclesDTO dto;
    static VehiclesRepository dtoRepo;
    static String pathFileDTO = "src/test/resources/Mock_JSON_Data/DTO/VehicleMock.json";
    static String pathFileRepo = "src/test/resources/Mock_JSON_Data/Repo/VehicleRepoMock.json";

    @BeforeAll
    static void initSetup() {

        dto = MockInjector.injectVehiclesDTO(pathFileDTO);
        dtoRepo = MockInjector.injectVehiclesRepository(pathFileRepo);
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
