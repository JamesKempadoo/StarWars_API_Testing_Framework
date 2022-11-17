package org.mtfbwy.spartanapi.framework.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FilmsRepository {

    @JsonProperty("next")
    private String next;

    @JsonProperty("previous")
    private String previous;

    @JsonProperty("count")
    private Integer count;

    @JsonProperty("results")
    private List<FilmDTO> results;

    public String getNext(){
        return next;
    }

    public String getPrevious(){
        return previous;
    }

    public Integer getCount(){
        return count;
    }

    public List<FilmDTO> getResults(){
        return results;
    }

    @Override
     public String toString(){
        return 
            "Repository{" + 
            "next = '" + next + '\'' + 
            ",previous = '" + previous + '\'' + 
            ",count = '" + count + '\'' + 
            ",results = '" + results + '\'' + 
            "}";
        }
}