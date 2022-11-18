package org.mtfbwy.spartanapi.framework.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.mtfbwy.spartanapi.framework.services.Endpoint;
import org.mtfbwy.spartanapi.framework.services.Util;

import static org.mtfbwy.spartanapi.framework.services.Util.capitalChecker;

public class PeopleDTO{

    @JsonProperty("films")
    private List<String> films;

    @JsonProperty("homeworld")
    private String homeworld;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("skin_color")
    private String skinColor;

    @JsonProperty("edited")
    private String edited;

    @JsonProperty("created")
    private String created;

    @JsonProperty("mass")
    private String mass;

    @JsonProperty("vehicles")
    private List<String> vehicles;

    @JsonProperty("url")
    private String url;

    @JsonProperty("hair_color")
    private String hairColor;

    @JsonProperty("birth_year")
    private String birthYear;

    @JsonProperty("eye_color")
    private String eyeColor;

    @JsonProperty("species")
    private List<String> species;

    @JsonProperty("starships")
    private List<String> starships;

    @JsonProperty("name")
    private String name;

    @JsonProperty("height")
    private String height;

    public List<String> getFilms(){
        return films;
    }

    public String getHomeworld(){
        return homeworld;
    }

    public String getGender(){
        return gender;
    }

    public String getSkinColor(){
        return skinColor;
    }

    public String getEdited(){
        return edited;
    }

    public String getCreated(){
        return created;
    }

    public String getMass(){
        return mass;
    }

    public List<String> getVehicles(){
        return vehicles;
    }

    public String getUrl(){
        return url;
    }

    public String getHairColor(){
        return hairColor;
    }

    public String getBirthYear(){
        return birthYear;
    }

    public String getEyeColor(){
        return eyeColor;
    }

    public List<String> getSpecies(){
        return species;
    }

    public List<String> getStarships(){
        return starships;
    }

    public String getName(){
        return name;
    }

    public String getHeight(){
        return height;
    }

    @Override
     public String toString(){
        return 
            "PeopleDTO{" + 
            "films = '" + films + '\'' + 
            ",homeworld = '" + homeworld + '\'' + 
            ",gender = '" + gender + '\'' + 
            ",skin_color = '" + skinColor + '\'' + 
            ",edited = '" + edited + '\'' + 
            ",created = '" + created + '\'' + 
            ",mass = '" + mass + '\'' + 
            ",vehicles = '" + vehicles + '\'' + 
            ",url = '" + url + '\'' + 
            ",hair_color = '" + hairColor + '\'' + 
            ",birth_year = '" + birthYear + '\'' + 
            ",eye_color = '" + eyeColor + '\'' + 
            ",species = '" + species + '\'' + 
            ",starships = '" + starships + '\'' + 
            ",name = '" + name + '\'' + 
            ",height = '" + height + '\'' + 
            "}";
        }

    public boolean isFilmsNull(){
        return films == null;
    }

    public boolean isFilmsEmpty(){
        return films.isEmpty();
    }

    public boolean isFilmsLinkFormat() {
        if (films.isEmpty()){
            return true;
        }
        if (Util.linkChecker(films, Endpoint.FILMS)) return false;
        return true;
    }

    public boolean isNameCapitalized(){
        return capitalChecker(name);
    }
    public boolean isNameNull(){
        return name == null;
    }

    public boolean isNameEmpty(){
        return name.isEmpty();
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
            case SPECIES:
                return getSpecies();
            case FILMS:
                return getFilms();
            case VEHICLES:
                return getVehicles();
            case STARSHIPS:
                return getStarships();
            default:
                throw new IllegalArgumentException();
        }
    }

    public Integer getHeightAsInteger(){
        if (isHeightNull()){
            return null;
        }
        return Integer.parseInt(height);
    }

    public boolean isHeightNull(){
        return height == null;
    }

    public boolean isHeightEmpty(){
        return height.isEmpty();
    }

    public Integer getMassAsInteger(){
        if (isMassNull()){
            return null;
        }
        return Integer.parseInt(mass);
    }

    public boolean isMassNull(){
        return mass == null;
    }

    public boolean isMassEmpty(){
        return mass.isEmpty();
    }




}