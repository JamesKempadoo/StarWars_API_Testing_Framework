package org.mtfbwy.spartanapi.framework.injection;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.mtfbwy.spartanapi.framework.connection.ConnectionManager;
import org.mtfbwy.spartanapi.framework.dto.*;
import org.mtfbwy.spartanapi.framework.exceptions.DTOnotCreatedException;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class MockInjector  {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static FilmDTO injectFilmDTO(String filePath) {

        FilmDTO dto = new FilmDTO();

        int statusCode = ConnectionManager.getStatusCode(filePath);

        if ( statusCode == 200 ) {

            try {
                dto = mapper.readValue(new File(filePath), FilmDTO.class);
            } catch (IOException e) {
                System.out.println("Request Successful. RESPONSE COULD NOT BE MAPPED TO DTO");
                e.printStackTrace();
            }
        } else {
            throw new DTOnotCreatedException("API Returned: " + statusCode + " status code. DTO NOT CREATED");
        }

        return dto;
    }

    public static PeopleDTO injectPeopleDTO(String filePath) {

        PeopleDTO dto = new PeopleDTO();

        int statusCode = ConnectionManager.getStatusCode(filePath);

        if ( statusCode == 200 ) {

            try {
                dto = mapper.readValue(new File(filePath), PeopleDTO.class);
            } catch (IOException e) {
                System.out.println("Request Successful. RESPONSE COULD NOT BE MAPPED TO DTO");
                e.printStackTrace();
            }
        } else {
            throw new DTOnotCreatedException("API Returned: " + statusCode + " status code. DTO NOT CREATED");
        }

        return dto;
    }

    public static PlanetsDTO injectPlanetsDTO(String filePath) {

        PlanetsDTO dto = new PlanetsDTO();

        int statusCode = ConnectionManager.getStatusCode(filePath);

        if ( statusCode == 200 ) {

            try {
                dto = mapper.readValue(new File(filePath), PlanetsDTO.class);
            } catch (IOException e) {
                System.out.println("Request Successful. RESPONSE COULD NOT BE MAPPED TO DTO");
                e.printStackTrace();
            }
        } else {
            throw new DTOnotCreatedException("API Returned: " + statusCode + " status code. DTO NOT CREATED");
        }

        return dto;
    }

    public static SpeciesDTO injectSpeciesDTO(String filePath) {

        SpeciesDTO dto = new SpeciesDTO();

        int statusCode = ConnectionManager.getStatusCode(filePath);

        if ( statusCode == 200 ) {

            try {
                dto = mapper.readValue(new File(filePath), SpeciesDTO.class);
            } catch (IOException e) {
                System.out.println("Request Successful. RESPONSE COULD NOT BE MAPPED TO DTO");
                e.printStackTrace();
            }
        } else {
            throw new DTOnotCreatedException("API Returned: " + statusCode + " status code. DTO NOT CREATED");
        }
        return dto;
    }

    public static StarshipDTO injectStarshipDTO(String filePath) {

        StarshipDTO dto = new StarshipDTO();

        int statusCode = ConnectionManager.getStatusCode(filePath);

        if ( statusCode == 200 ) {

            try {
                dto = mapper.readValue(new File(filePath), StarshipDTO.class);
            } catch (IOException e) {
                System.out.println("Request Successful. RESPONSE COULD NOT BE MAPPED TO DTO");
                e.printStackTrace();
            }
        } else {
            throw new DTOnotCreatedException("API Returned: " + statusCode + " status code. DTO NOT CREATED");
        }

        return dto;
    }

    public static VehiclesDTO injectVehiclesDTO(String filePath) {

        VehiclesDTO dto = new VehiclesDTO();

        int statusCode = ConnectionManager.getStatusCode(filePath);

        if ( statusCode == 200 ) {

            try {
                dto = mapper.readValue(new File(filePath), VehiclesDTO.class);
            } catch (IOException e) {
                System.out.println("Request Successful. RESPONSE COULD NOT BE MAPPED TO DTO");
                e.printStackTrace();
            }
        } else {
            throw new DTOnotCreatedException("API Returned: " + statusCode + " status code. DTO NOT CREATED");
        }

        return dto;
    }

    // REPOSITORY Injectors


    public static FilmsRepository injectFilmRepository(String filePath) {


        FilmsRepository repo = new FilmsRepository();

        int statusCode = ConnectionManager.getStatusCode(filePath);

        if ( statusCode == 200 ) {

            try {
                repo = mapper.readValue(new File(filePath), FilmsRepository.class);
            } catch (IOException e) {
                System.out.println("Request Successful. RESPONSE COULD NOT BE MAPPED TO DTO");
                e.printStackTrace();
            }
        } else {
            throw new DTOnotCreatedException("API Returned: " + statusCode + " status code. DTO NOT CREATED");
        }

        return repo;
    }

    public static PeopleRepository injectPeopleRepository(String filePath) {

        PeopleRepository repo = new PeopleRepository();

        int statusCode = ConnectionManager.getStatusCode(filePath);

        if ( statusCode == 200 ) {

            try {
                repo = mapper.readValue(new File(filePath), PeopleRepository.class);
            } catch (IOException e) {
                System.out.println("Request Successful. RESPONSE COULD NOT BE MAPPED TO DTO");
                e.printStackTrace();
            }
        } else {
            throw new DTOnotCreatedException("API Returned: " + statusCode + " status code. DTO NOT CREATED");
        }

        return repo;
    }

    public static PlanetsRepository injectPlanetRepository(String filePath) {

        PlanetsRepository repo = new PlanetsRepository();

        int statusCode = ConnectionManager.getStatusCode(filePath);

        if ( statusCode == 200 ) {

            try {
                repo = mapper.readValue(new File(filePath), PlanetsRepository.class);
            } catch (IOException e) {
                System.out.println("Request Successful. RESPONSE COULD NOT BE MAPPED TO DTO");
                e.printStackTrace();
            }
        } else {
            throw new DTOnotCreatedException("API Returned: " + statusCode + " status code. DTO NOT CREATED");
        }
        return repo;
    }

    public static SpeciesRepository injectSpeciesRepository(String filePath) {

        SpeciesRepository repo = new SpeciesRepository();

        int statusCode = ConnectionManager.getStatusCode(filePath);

        if ( statusCode == 200 ) {

            try {
                repo = mapper.readValue(new File(filePath), SpeciesRepository.class);
            } catch (IOException e) {
                System.out.println("Request Successful. RESPONSE COULD NOT BE MAPPED TO DTO");
                e.printStackTrace();
            }
        } else {
            throw new DTOnotCreatedException("API Returned: " + statusCode + " status code. DTO NOT CREATED");
        }

        return repo;
    }

    public static StarshipsRepository injectStarshipsRepository(String filePath) {

        StarshipsRepository repo = new StarshipsRepository();

        int statusCode = ConnectionManager.getStatusCode(filePath);

        if ( statusCode == 200 ) {

            try {
                repo = mapper.readValue(new File(filePath), StarshipsRepository.class);
            } catch (IOException e) {
                System.out.println("Request Successful. RESPONSE COULD NOT BE MAPPED TO DTO");
                e.printStackTrace();
            }
        } else {
            throw new DTOnotCreatedException("API Returned: " + statusCode + " status code. DTO NOT CREATED");
        }

        return repo;
    }

    public static VehiclesRepository injectVehiclesRepository(String filePath) {

        VehiclesRepository repo = new VehiclesRepository();

        int statusCode = ConnectionManager.getStatusCode(filePath);

        if ( statusCode == 200 ) {

            try {
                repo = mapper.readValue(new File(filePath), VehiclesRepository.class);
            } catch (IOException e) {
                System.out.println("Request Successful. RESPONSE COULD NOT BE MAPPED TO DTO");
                e.printStackTrace();
            }
        } else {
            throw new DTOnotCreatedException("API Returned: " + statusCode + " status code. DTO NOT CREATED");
        }

        return repo;
    }
}
