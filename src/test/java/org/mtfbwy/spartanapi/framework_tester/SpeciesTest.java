package org.mtfbwy.spartanapi.framework_tester;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mtfbwy.spartanapi.framework.connection.ConnectionManager;
import org.mtfbwy.spartanapi.framework.dto.SpeciesDTO;
import org.mtfbwy.spartanapi.framework.dto.SpeciesRepository;
import org.mtfbwy.spartanapi.framework.injection.MockInjector;
import org.mtfbwy.spartanapi.framework.services.Endpoint;

public class SpeciesTest {

    static SpeciesDTO dto;
    static SpeciesRepository dtoRepo;
    static String pathFileDTO = "src/test/resources/Mock_JSON_Data/DTO/SpeciesMock.json";
    static String pathFileRepo = "src/test/resources/Mock_JSON_Data/Repo/SpeciesRepoMock.json";



    @BeforeAll
    static void initSetup() {

        dto = MockInjector.injectSpeciesDTO(pathFileDTO);
        dtoRepo = MockInjector.injectSpeciesRepository(pathFileRepo);

    }

    @Test
    @DisplayName("Check that average lifespan is not empty")
    void CheckThatAverageLifeSpanIsNotEmpty() {
        Assertions.assertTrue(dto.DestinationNotEmpty());
        System.out.println(dto.DestinationNotEmpty());

    }
    @Test
    @DisplayName("testing response for designation")
    void testingResponseForDesignation() {
        Assertions.assertEquals("sentient", dto.getDesignation());
        System.out.println(dto.getDesignation());
    }
    @Test
    @DisplayName("check Value Is Known")
    void checkValueIsKnown() {
        Assertions.assertNotEquals("unknown", dto.getKnownAverageHeight());
        System.out.println(dto.getKnownAverageHeight());
    }
}
