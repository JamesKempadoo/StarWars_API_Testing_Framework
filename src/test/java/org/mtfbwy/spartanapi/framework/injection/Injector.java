package org.mtfbwy.spartanapi.framework.injection;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.mtfbwy.spartanapi.framework.connection.ConnectionManager;
import org.mtfbwy.spartanapi.framework.dto.*;
import org.mtfbwy.spartanapi.framework.exceptions.DTOnotCreatedException;

import java.io.IOException;
import java.net.URL;

public class Injector  {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static FilmDTO injectFilmDTO(String urlRequest) {
        
        FilmDTO dto = new FilmDTO();

        int statusCode = ConnectionManager.getStatusCode(urlRequest);

        if ( statusCode == 200 ) {

            try {
                dto = mapper.readValue(new URL(urlRequest), FilmDTO.class);
            } catch (IOException e) {
                System.out.println("Request Successful. RESPONSE COULD NOT BE MAPPED TO DTO");
                e.printStackTrace();
            }
        } else {
            throw new DTOnotCreatedException("API Returned: " + statusCode + " status code. DTO NOT CREATED");
        }

        return dto;
    }

    public static PeopleDTO injectPeopleDTO(String urlRequest) {

        PeopleDTO dto = new PeopleDTO();

        int statusCode = ConnectionManager.getStatusCode(urlRequest);

        if ( statusCode == 200 ) {

            try {
                dto = mapper.readValue(new URL(urlRequest), PeopleDTO.class);
            } catch (IOException e) {
                System.out.println("Request Successful. RESPONSE COULD NOT BE MAPPED TO DTO");
                e.printStackTrace();
            }
        } else {
            throw new DTOnotCreatedException("API Returned: " + statusCode + " status code. DTO NOT CREATED");
        }

        return dto;
    }

    public static PlanetsDTO injectPlanetsDTO(String urlRequest) {

        PlanetsDTO dto = new PlanetsDTO();

        int statusCode = ConnectionManager.getStatusCode(urlRequest);

        if ( statusCode == 200 ) {

            try {
                dto = mapper.readValue(new URL(urlRequest), PlanetsDTO.class);
            } catch (IOException e) {
                System.out.println("Request Successful. RESPONSE COULD NOT BE MAPPED TO DTO");
                e.printStackTrace();
            }
        } else {
            throw new DTOnotCreatedException("API Returned: " + statusCode + " status code. DTO NOT CREATED");
        }

        return dto;
    }

    public static SpeciesDTO injectSpeciesDTO(String urlRequest) {

        SpeciesDTO dto = new SpeciesDTO();

        int statusCode = ConnectionManager.getStatusCode(urlRequest);

        if ( statusCode == 200 ) {

            try {
                dto = mapper.readValue(new URL(urlRequest), SpeciesDTO.class);
            } catch (IOException e) {
                System.out.println("Request Successful. RESPONSE COULD NOT BE MAPPED TO DTO");
                e.printStackTrace();
            }
        } else {
            throw new DTOnotCreatedException("API Returned: " + statusCode + " status code. DTO NOT CREATED");
        }
        return dto;
    }

    public static StarshipDTO injectStarshipDTO(String urlRequest) {

        StarshipDTO dto = new StarshipDTO();

        int statusCode = ConnectionManager.getStatusCode(urlRequest);

        if ( statusCode == 200 ) {

            try {
                dto = mapper.readValue(new URL(urlRequest), StarshipDTO.class);
            } catch (IOException e) {
                System.out.println("Request Successful. RESPONSE COULD NOT BE MAPPED TO DTO");
                e.printStackTrace();
            }
        } else {
            throw new DTOnotCreatedException("API Returned: " + statusCode + " status code. DTO NOT CREATED");
        }

        return dto;
    }

    public static VehiclesDTO injectVehiclesDTO(String urlRequest) {

        VehiclesDTO dto = new VehiclesDTO();

        int statusCode = ConnectionManager.getStatusCode(urlRequest);

        if ( statusCode == 200 ) {

            try {
                dto = mapper.readValue(new URL(urlRequest), VehiclesDTO.class);
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


    public static FilmsRepository injectFilmRepository(String urlRequest) {


        FilmsRepository repo = new FilmsRepository();

        int statusCode = ConnectionManager.getStatusCode(urlRequest);

        if ( statusCode == 200 ) {

            try {
                repo = mapper.readValue(new URL(urlRequest), FilmsRepository.class);
            } catch (IOException e) {
                System.out.println("Request Successful. RESPONSE COULD NOT BE MAPPED TO DTO");
                e.printStackTrace();
            }
        } else {
            throw new DTOnotCreatedException("API Returned: " + statusCode + " status code. DTO NOT CREATED");
        }

        return repo;
    }

    public static PeopleRepository injectPeopleRepository(String urlRequest) {

        PeopleRepository repo = new PeopleRepository();

        int statusCode = ConnectionManager.getStatusCode(urlRequest);

        if ( statusCode == 200 ) {

            try {
                repo = mapper.readValue(new URL(urlRequest), PeopleRepository.class);
            } catch (IOException e) {
                System.out.println("Request Successful. RESPONSE COULD NOT BE MAPPED TO DTO");
                e.printStackTrace();
            }
        } else {
            throw new DTOnotCreatedException("API Returned: " + statusCode + " status code. DTO NOT CREATED");
        }

        return repo;
    }

    public static PlanetsRepository injectPlanetRepository(String urlRequest) {

        PlanetsRepository repo = new PlanetsRepository();

        int statusCode = ConnectionManager.getStatusCode(urlRequest);

        if ( statusCode == 200 ) {

            try {
                repo = mapper.readValue(new URL(urlRequest), PlanetsRepository.class);
            } catch (IOException e) {
                System.out.println("Request Successful. RESPONSE COULD NOT BE MAPPED TO DTO");
                e.printStackTrace();
            }
        } else {
            throw new DTOnotCreatedException("API Returned: " + statusCode + " status code. DTO NOT CREATED");
        }
        return repo;
    }

    public static SpeciesRepository injectSpeciesRepository(String urlRequest) {

        SpeciesRepository repo = new SpeciesRepository();

        int statusCode = ConnectionManager.getStatusCode(urlRequest);

        if ( statusCode == 200 ) {

            try {
                repo = mapper.readValue(new URL(urlRequest), SpeciesRepository.class);
            } catch (IOException e) {
                System.out.println("Request Successful. RESPONSE COULD NOT BE MAPPED TO DTO");
                e.printStackTrace();
            }
        } else {
            throw new DTOnotCreatedException("API Returned: " + statusCode + " status code. DTO NOT CREATED");
        }

        return repo;
    }

    public static StarshipsRepository injectStarshipsRepository(String urlRequest) {

        StarshipsRepository repo = new StarshipsRepository();

        int statusCode = ConnectionManager.getStatusCode(urlRequest);

        if ( statusCode == 200 ) {

            try {
                repo = mapper.readValue(new URL(urlRequest), StarshipsRepository.class);
            } catch (IOException e) {
                System.out.println("Request Successful. RESPONSE COULD NOT BE MAPPED TO DTO");
                e.printStackTrace();
            }
        } else {
            throw new DTOnotCreatedException("API Returned: " + statusCode + " status code. DTO NOT CREATED");
        }

        return repo;
    }

    public static VehiclesRepository injectVehiclesRepository(String urlRequest) {

        VehiclesRepository repo = new VehiclesRepository();

        int statusCode = ConnectionManager.getStatusCode(urlRequest);

        if ( statusCode == 200 ) {

            try {
                repo = mapper.readValue(new URL(urlRequest), VehiclesRepository.class);
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
