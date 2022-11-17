package org.mtfbwy.spartanapi.framework.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.mtfbwy.spartanapi.framework.services.Endpoint;

public class FilmDTO{

    @JsonProperty("edited")
    private String edited;

    @JsonProperty("director")
    private String director;

    @JsonProperty("created")
    private String created;

    @JsonProperty("vehicles")
    private List<String> vehicles;

    @JsonProperty("opening_crawl")
    private String openingCrawl;

    @JsonProperty("title")
    private String title;

    @JsonProperty("url")
    private String url;

    @JsonProperty("characters")
    private List<String> characters;

    @JsonProperty("episode_id")
    private Integer episodeId;

    @JsonProperty("planets")
    private List<String> planets;

    @JsonProperty("release_date")
    private String releaseDate;

    @JsonProperty("starships")
    private List<String> starships;

    @JsonProperty("species")
    private List<String> species;

    @JsonProperty("producer")
    private String producer;

    public String getEdited(){
        return edited;
    }

    public String getDirector(){
        return director;
    }

    public String getCreated(){
        return created;
    }

    public List<String> getVehicles(){
        return vehicles;
    }

    public String getOpeningCrawl(){
        return openingCrawl;
    }

    public String getTitle(){
        return title;
    }

    public String getUrl(){
        return url;
    }

    public List<String> getCharacters(){
        return characters;
    }

    public Integer getEpisodeId(){
        return episodeId;
    }

    public List<String> getPlanets(){
        return planets;
    }

    public String getReleaseDate(){
        return releaseDate;
    }

    public List<String> getStarships(){
        return starships;
    }

    public List<String> getSpecies(){
        return species;
    }

    public String getProducer(){
        return producer;
    }

    public boolean checkIfIdExistsInList(Endpoint endpoint, int id) {
        List<String> checkingList = findList(endpoint);
        for (String elem:checkingList) {
            if (elem.contains(String.valueOf(id))){
                return true;
            }
        }
        return false;
    }

    private List<String> findList(Endpoint endpoint) {
        switch (endpoint) {
            case PEOPLE:
                return getCharacters();
            case PLANETS:
                return getPlanets();
            case STARSHIPS:
                return getStarships();
            case SPECIES:
                return getSpecies();
            case VEHICLES:
                return getVehicles();
            default:
                throw new IllegalArgumentException();
        }

    }

    @Override
     public String toString(){
        return 
            "FilmDTO{" + 
            "edited = '" + edited + '\'' + 
            ",director = '" + director + '\'' + 
            ",created = '" + created + '\'' + 
            ",vehicles = '" + vehicles + '\'' + 
            ",opening_crawl = '" + openingCrawl + '\'' + 
            ",title = '" + title + '\'' + 
            ",url = '" + url + '\'' + 
            ",characters = '" + characters + '\'' + 
            ",episode_id = '" + episodeId + '\'' + 
            ",planets = '" + planets + '\'' + 
            ",release_date = '" + releaseDate + '\'' + 
            ",starships = '" + starships + '\'' + 
            ",species = '" + species + '\'' + 
            ",producer = '" + producer + '\'' + 
            "}";
        }
}