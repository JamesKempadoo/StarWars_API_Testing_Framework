package org.mtfbwy.spartanapi.framework.injection;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.mtfbwy.spartanapi.framework.dto.FilmDTO;
import org.mtfbwy.spartanapi.framework.dto.PeopleDTO;
import org.mtfbwy.spartanapi.framework.dto.PlanetsDTO;
import org.mtfbwy.spartanapi.framework.dto.SpeciesDTO;
import org.mtfbwy.spartanapi.framework.dto.StarshipDTO;
import org.mtfbwy.spartanapi.framework.dto.VehiclesDTO;
import java.io.IOException;
import java.net.URL;

public class Injector  {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static FilmDTO injectFilmDTO(String urlRequest) {

        FilmDTO dto = new FilmDTO();

        try {
            dto = mapper.readValue(new URL(urlRequest), FilmDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dto;
    }

    public static PeopleDTO injectPeopleDTO(String urlRequest) {

        PeopleDTO dto = new PeopleDTO();

        try {
            dto = mapper.readValue(new URL(urlRequest), PeopleDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dto;
    }

    public static PlanetsDTO injectPlanetsDTO(String urlRequest) {

        PlanetsDTO dto = new PlanetsDTO();

        try {
            dto = mapper.readValue(new URL(urlRequest), PlanetsDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dto;
    }

    public static SpeciesDTO injectSpeciesDTO(String urlRequest) {

        SpeciesDTO dto = new SpeciesDTO();

        try {
            dto = mapper.readValue(new URL(urlRequest), SpeciesDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dto;
    }

    public static StarshipDTO injectStarshipDTO(String urlRequest) {

        StarshipDTO dto = new StarshipDTO();

        try {
            dto = mapper.readValue(new URL(urlRequest), StarshipDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dto;
    }

    public static VehiclesDTO injectVehiclesDTO(String urlRequest) {

        VehiclesDTO dto = new VehiclesDTO();

        try {
            dto = mapper.readValue(new URL(urlRequest), VehiclesDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dto;
    }
}
