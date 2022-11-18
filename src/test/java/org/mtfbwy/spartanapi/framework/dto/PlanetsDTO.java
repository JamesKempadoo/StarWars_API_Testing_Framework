package org.mtfbwy.spartanapi.framework.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.cucumber.java.sl.In;
import org.mtfbwy.spartanapi.framework.services.Endpoint;
import org.mtfbwy.spartanapi.framework.services.Util;

public class PlanetsDTO{

    @JsonProperty("films")
    private List<String> films;

    @JsonProperty("edited")
    private String edited;

    @JsonProperty("created")
    private String created;

    @JsonProperty("climate")
    private String climate;

    @JsonProperty("rotation_period")
    private String rotationPeriod;

    @JsonProperty("url")
    private String url;

    @JsonProperty("population")
    private String population;

    @JsonProperty("orbital_period")
    private String orbitalPeriod;

    @JsonProperty("surface_water")
    private String surfaceWater;

    @JsonProperty("diameter")
    private String diameter;

    @JsonProperty("gravity")
    private String gravity;

    @JsonProperty("name")
    private String name;

    @JsonProperty("residents")
    private List<String> residents;

    @JsonProperty("terrain")
    private String terrain;

    public List<String> getFilms(){
        return films;
    }

    public boolean isFilmsLinkFormat() {
        if (films.isEmpty()){
            return true;
        }
        if (Util.linkChecker(films, Endpoint.FILMS)) return false;
        return true;
    }


    public boolean isFilmsEmpty(){
        return films.isEmpty();
    }

    public boolean isFilmNull(){
        return films==null;
    }

    public String getEdited(){
        return edited;
    }

    public boolean isEditedNull(){
        return edited==null;
    }

    public boolean isEditedEmpty(){
        return edited.isEmpty();
    }

    public boolean isEditedAsZDT(){
        return Util.isBeforeDateNow(edited);
    }

    public String getCreated(){
        return created;
    }

    public boolean isCreatedAsZDT(){
        return Util.isBeforeDateNow(created);
    }

    public boolean isCreatedNull(){
        return created==null;
    }

    public boolean isCreatedEmpty(){
        return created.isEmpty();
    }

    public String getClimate(){
        return climate;
    }

    public String[] getClimateAsArray(){
        return climate.split(", ");
    }

    public boolean isClimateNull(){
        return climate==null;
    }

    public boolean isClimateEmpty(){
        return climate.isEmpty();
    }

    public String getRotationPeriod(){
        return rotationPeriod;
    }

    public Integer getRotationPeriodAsInteger(){
        if (isRotationPeriodNull()){
            return null;
        }
        return Integer.parseInt(rotationPeriod);
    }

    public boolean isRotationPeriodBigger0(){
        return getRotationPeriodAsInteger()>0;
    }


    public boolean isRotationPeriodNull(){
        return rotationPeriod==null;
    }

    public boolean isRotationPeriodEmpty(){
        return rotationPeriod.isEmpty();
    }

    public String getUrl(){
        return url;
    }

    public boolean isUrlAccurate(){
        List<String> list = new ArrayList<>();
        list.add(url);
        return Util.linkChecker(list,Endpoint.PLANETS);
    }

    public boolean isUrlPeriodNull(){
        return rotationPeriod==null;
    }

    public boolean isUrlPeriodEmpty(){
        return rotationPeriod.isEmpty();
    }

    public String getPopulation(){
        return population;
    }

    public Integer getPopulationAsInteger(){
        if (isPopulationNull()|surfaceWater.equals("unknown")){
            return null;
        }
        return Integer.parseInt(population);
    }

    public boolean isPopulationNull(){
        return population==null;
    }

    public boolean isPopulationEmpty(){
        return population.isEmpty();
    }

    public String getOrbitalPeriod(){
        return orbitalPeriod;
    }

    public Integer getOrbitalPeriodAsInteger(){
        if (isOrbitalNull()){
            return null;
        }
        return Integer.parseInt(orbitalPeriod);
    }

    public boolean isOrbitalNull(){
        return orbitalPeriod==null;
    }

    public String getSurfaceWater(){
        return surfaceWater;
    }

    public Integer getSurfaceWaterAsInteger(){
        if (isSurfaceWaterNull()|surfaceWater.equals("unknown")){
            return null;
        }
        return Integer.parseInt(surfaceWater);
    }

    public boolean isSurfaceWaterNull(){
        return surfaceWater==null;
    }

    public String getDiameter(){
        return diameter;
    }

    public Integer getDiameterAsInteger(){
        if (isDiameterNull()){
            return null;
        }
        return Integer.parseInt(diameter);
    }

    public boolean isDiameterLess0(){
        return getDiameterAsInteger()<0;
    }

    public boolean isDiameterNull(){
        return diameter==null;
    }

    public boolean isDiameterEmpty(){
        return diameter.isEmpty();
    }

    public String getGravity(){
        return gravity;
    }
    public List<String> getGravityAsList(){
        if (gravity==null){
            return null;
        }else if(gravity.isEmpty()){
            return null;
        }
        return Arrays.stream(gravity.replaceAll("standard","").split(", ")).toList();
    }

    public boolean isGravityValuesSmaller0(){
        List<String> list = getGravityAsList();
        List<Double> intList = null;
        if (list==null){
            return false;
        } else if (list.get(0).equals("N/A")||list.isEmpty()) {
            return false;
        }
        for (String item: list){
            if (!(item ==null)){
                Double aDouble = Double.parseDouble(item.replaceAll("\\s\\(+\\w*\\s?\\w*\\)?",""));
                if (aDouble<0){
                    return true;
                }
            }else {return false;}
        }
        return false;
    }

    public boolean isGravityNull(){
        return gravity==null;
    }

    public boolean isGravityEmpty(){
        return gravity.isEmpty();
    }


    public String getName(){
        return name;
    }

    public boolean isNameCapitalized(){
        return Util.capitalChecker(name);
    }

    public boolean isNameEmpty(){
        return name.isEmpty();
    }

    public boolean isNameNull(){
        return  name==null;
    }

    public List<String> getResidents(){
        return residents;
    }

    public boolean isResidentsLinkFormat() {
        if (residents.isEmpty()){
            return true;
        }
        if (Util.linkChecker(residents, Endpoint.PEOPLE)) return false;
        return true;
    }

    public boolean isResidentsEmpty(){
        return residents.isEmpty();
    }

    public boolean isResidentsNull(){
        return residents==null;
    }

    public String getTerrain(){
        return terrain;
    }

    public boolean isTerrainNull(){
        return terrain==null;
    }
    public boolean isTerrainEmpty(){
        return terrain.isEmpty();
    }

    @Override
    public String toString(){
        return
                "PlanetsDTO{" +
                        "films = '" + films + '\'' +
                        ",edited = '" + edited + '\'' +
                        ",created = '" + created + '\'' +
                        ",climate = '" + climate + '\'' +
                        ",rotation_period = '" + rotationPeriod + '\'' +
                        ",url = '" + url + '\'' +
                        ",population = '" + population + '\'' +
                        ",orbital_period = '" + orbitalPeriod + '\'' +
                        ",surface_water = '" + surfaceWater + '\'' +
                        ",diameter = '" + diameter + '\'' +
                        ",gravity = '" + gravity + '\'' +
                        ",name = '" + name + '\'' +
                        ",residents = '" + residents + '\'' +
                        ",terrain = '" + terrain + '\'' +
                        "}";
    }
}