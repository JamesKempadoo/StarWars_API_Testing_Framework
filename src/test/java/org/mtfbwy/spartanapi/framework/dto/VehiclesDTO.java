package org.mtfbwy.spartanapi.framework.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.mtfbwy.spartanapi.framework.services.Endpoint;
import org.mtfbwy.spartanapi.framework.services.Util;

import static org.mtfbwy.spartanapi.framework.services.Util.capitalChecker;

public class VehiclesDTO{

    @JsonProperty("max_atmosphering_speed")
    private String maxAtmospheringSpeed;

    @JsonProperty("cargo_capacity")
    private String cargoCapacity;

    @JsonProperty("films")
    private List<String> films;

    @JsonProperty("passengers")
    private String passengers;

    @JsonProperty("pilots")
    private List<String> pilots;

    @JsonProperty("edited")
    private String edited;

    @JsonProperty("consumables")
    private String consumables;

    @JsonProperty("created")
    private String created;

    @JsonProperty("length")
    private String length;

    @JsonProperty("url")
    private String url;

    @JsonProperty("manufacturer")
    private String manufacturer;

    @JsonProperty("crew")
    private String crew;

    @JsonProperty("vehicle_class")
    private String vehicleClass;

    @JsonProperty("cost_in_credits")
    private String costInCredits;

    @JsonProperty("name")
    private String name;

    @JsonProperty("model")
    private String model;

    public String getMaxAtmospheringSpeed(){
        return maxAtmospheringSpeed;
    }

    public String getCargoCapacity(){
        return cargoCapacity;
    }

    public List<String> getFilms(){
        return films;
    }

    public String getPassengers(){
        return passengers;
    }

    public List<String> getPilots(){
        return pilots;
    }

    public String getEdited(){
        return edited;
    }

    public String getConsumables(){
        return consumables;
    }

    public String getCreated(){
        return created;
    }

    public String getLength(){
        return length;
    }

    public String getUrl(){
        return url;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public String getCrew(){
        return crew;
    }

    public String getVehicleClass(){
        return vehicleClass;
    }

    public String getCostInCredits(){
        return costInCredits;
    }

    public String getName(){
        return name;
    }

    public String getModel(){
        return model;
    }

    //Additional Methods

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
                return getPilots();
            case FILMS:
                return getFilms();
            default:
                throw new IllegalArgumentException();
        }

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

    public boolean isModelCapitalized(){
        return capitalChecker(model);
    }
    public boolean isModelNull(){
        return model == null;
    }

    public boolean isModelEmpty(){
        return model.isEmpty();
    }

    public boolean isManufacturerCapitalized(){
        return capitalChecker(manufacturer);
    }
    public boolean isManufacturerNull(){
        return manufacturer == null;
    }

    public boolean isManufacturerEmpty(){
        return manufacturer.isEmpty();
    }


    public Integer getCostInCreditsAsInteger(){
        if (costInCredits == null){
            return null;
        }

        return Integer.parseInt(costInCredits);
    }
    public boolean isCostInCreditsNull(){
        return costInCredits == null;
    }

    public boolean isCostInCreditsEmpty(){
        return costInCredits.isEmpty();
    }

    public Float getLengthAsFloat(){
        if (length == null){
            return null;
        }

        return Float.parseFloat(length);
    }
    public boolean isLengthNull(){
        return length == null;
    }

    public boolean isLengthEmpty(){
        return length.isEmpty();
    }

    public Integer getMaxAtmospheringSpeedAsInteger(){
        if (maxAtmospheringSpeed == null){
            return null;
        }

        return Integer.parseInt(maxAtmospheringSpeed);
    }
    public boolean isMaxAtmospheringSpeedNull(){
        return maxAtmospheringSpeed == null;
    }

    public boolean isMaxAtmospheringSpeedEmpty(){
        return maxAtmospheringSpeed.isEmpty();
    }

    public Integer getCrewAsInteger(){
        if (crew == null){
            return null;
        }

        return Integer.parseInt(crew);
    }
    public boolean isCrewNull(){
        return crew == null;
    }

    public boolean isCrewEmpty(){
        return crew.isEmpty();
    }

    public Integer getPassengersAsInteger(){
        if (passengers == null){
            return null;
        }

        return Integer.parseInt(passengers);
    }
    public boolean isPassengersNull(){
        return passengers == null;
    }

    public boolean isPassengersEmpty(){
        return passengers.isEmpty();
    }

    public boolean isConsumablesNull(){
        return consumables == null;
    }

    public boolean isConsumablesEmpty(){
        return consumables.isEmpty();
    }

    public boolean isVehicleClassNull(){
        return vehicleClass == null;
    }

    public boolean isVehiclesClassEmpty(){
        return vehicleClass.isEmpty();
    }

    public boolean isPilotsNull(){
        return pilots == null;
    }

    public boolean isPilotsEmpty(){
        return pilots.isEmpty();
    }

    public boolean isPilotsLinkFormatCorrect(){
        if (isFilmsEmpty() & isFilmsNull()){
            Util.linkChecker(pilots, Endpoint.PEOPLE);
        }
        return false;
    }

    public boolean isFilmsNull(){
        return films == null;
    }

    public boolean isFilmsEmpty(){
        return films.isEmpty();
    }

    public boolean isFilmLinkFormatCorrect(){
        if (isFilmsEmpty() & isFilmsNull()){
                Util.linkChecker(films, Endpoint.FILMS);
        }
        return false;
    }



    @Override
     public String toString(){
        return 
            "VehiclesDTO{" + 
            "max_atmosphering_speed = '" + maxAtmospheringSpeed + '\'' + 
            ",cargo_capacity = '" + cargoCapacity + '\'' + 
            ",films = '" + films + '\'' + 
            ",passengers = '" + passengers + '\'' + 
            ",pilots = '" + pilots + '\'' + 
            ",edited = '" + edited + '\'' + 
            ",consumables = '" + consumables + '\'' + 
            ",created = '" + created + '\'' + 
            ",length = '" + length + '\'' + 
            ",url = '" + url + '\'' + 
            ",manufacturer = '" + manufacturer + '\'' + 
            ",crew = '" + crew + '\'' + 
            ",vehicle_class = '" + vehicleClass + '\'' + 
            ",cost_in_credits = '" + costInCredits + '\'' + 
            ",name = '" + name + '\'' + 
            ",model = '" + model + '\'' + 
            "}";
        }
}