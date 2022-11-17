package org.mtfbwy.spartanapi.framework.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SpeciesDTO{

    @JsonProperty("films")
    private List<String> films;

    @JsonProperty("skin_colors")
    private String skinColors;

    @JsonProperty("homeworld")
    private String homeworld;

    @JsonProperty("edited")
    private String edited;

    @JsonProperty("created")
    private String created;

    @JsonProperty("eye_colors")
    private String eyeColors;

    @JsonProperty("language")
    private String language;

    @JsonProperty("classification")
    private String classification;

    @JsonProperty("people")
    private List<String> people;

    @JsonProperty("url")
    private String url;

    @JsonProperty("hair_colors")
    private String hairColors;

    @JsonProperty("average_height")
    private String averageHeight;

    @JsonProperty("name")
    private String name;

    @JsonProperty("designation")
    private String designation;

    @JsonProperty("average_lifespan")
    private String averageLifespan;

    public List<String> getFilms(){
        return films;
    }

    public String getSkinColors(){
        return skinColors;
    }
    public boolean skinColorsNotEmpty(){
        return skinColors.length() >0;
    }

    public String getHomeworld(){
        return homeworld;
    }
    public boolean homeWorldNotEmpty(){
        return homeworld.length() >0;
    }

    public String getEdited(){
        return edited;
    }

    public String getCreated(){
        return created;
    }

    public String getEyeColors(){
        return eyeColors;
    }
    public boolean eyeColorsNotEmpty(){
        return eyeColors.length() >0;
    }
    public String getKnownEyeColour(){
        if (eyeColors.equals("n/a")){
            return null;

        }
        return eyeColors;
    }

    public String getLanguage(){
        return language;
    }
    public boolean languageNotEmpty(){
        return language.length() >0;
    }

    public String getClassification(){
        return classification;
    }
    public boolean classificationNotEmpty(){
        return classification.length() >0;
    }

    public List<String> getPeople(){
        return people;
    }

    public boolean peopleNotNull(){
        return people != null;
    }

    public String getUrl(){
        return url;
    }

    public String getHairColors(){
        return hairColors;
    }
    public boolean hairColorsNotEmpty(){
        return hairColors.length() >0;
    }
    public String getKnownHairColour(){
        if (hairColors.equals("n/a")){
            return null;

        }
        return hairColors;
    }

    public String getAverageHeight(){
        return averageHeight;
    }
    public boolean AverageHeightIsPositive(){
        return averageHeight.length() >0;
    }
    public String getKnownAverageHeight(){
        if (averageHeight.equals("unknown")){
            return null;

        }
        return averageHeight;
    }

    public String getName(){
        return name;
    }
    public boolean NameNotEmpty(){
        return name.length() >0;
    }

    public String getDesignation(){
        return designation;
    }

    public boolean DestinationNotEmpty(){
        return designation.length() >0;
    }


    public String getAverageLifespan(){
        return averageLifespan;
    }
    public boolean averageLifespanNotEmpty(){
        return averageLifespan.length() >0;
    }
    public String getKnownAverageLifeSpan(){
        if (averageLifespan.equals("unknown")){
            return null;

        }
        return averageLifespan;
    }

    @Override
     public String toString(){
        return
            "SpeciesDTO{" +
            "films = '" + films + '\'' +
            ",skin_colors = '" + skinColors + '\'' +
            ",homeworld = '" + homeworld + '\'' +
            ",edited = '" + edited + '\'' +
            ",created = '" + created + '\'' +
            ",eye_colors = '" + eyeColors + '\'' +
            ",language = '" + language + '\'' +
            ",classification = '" + classification + '\'' +
            ",people = '" + people + '\'' +
            ",url = '" + url + '\'' +
            ",hair_colors = '" + hairColors + '\'' +
            ",average_height = '" + averageHeight + '\'' +
            ",name = '" + name + '\'' +
            ",designation = '" + designation + '\'' +
            ",average_lifespan = '" + averageLifespan + '\'' +
            "}";
        }



}