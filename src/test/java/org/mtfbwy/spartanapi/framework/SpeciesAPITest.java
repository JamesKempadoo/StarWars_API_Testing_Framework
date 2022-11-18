package org.mtfbwy.spartanapi.framework;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mtfbwy.spartanapi.framework.connection.ConnectionManager;
import org.mtfbwy.spartanapi.framework.dto.SpeciesDTO;
import org.mtfbwy.spartanapi.framework.dto.SpeciesRepository;
import org.mtfbwy.spartanapi.framework.injection.Injector;
import org.mtfbwy.spartanapi.framework.services.Endpoint;

import java.io.IOException;
import java.net.URL;


public class SpeciesAPITest {

    static SpeciesDTO dto;
    static SpeciesRepository dtoRepo;
    static int status;
    static String urlEndPointDTO = ConnectionManager.getConnection(Endpoint.SPECIES, 1);
    static String urlEndPointRepo = ConnectionManager.getConnection(Endpoint.SPECIES);



    @BeforeAll
    static void initSetup() {

        dto = Injector.injectSpeciesDTO(urlEndPointDTO);
        status = ConnectionManager.getStatusCode(urlEndPointDTO);
        System.out.println(status);
        dtoRepo = Injector.injectSpeciesRepository(urlEndPointRepo);

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
