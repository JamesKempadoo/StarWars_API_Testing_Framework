package org.mtfbwy.spartanapi.framework.dto;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StarshipsRepository{

    @JsonProperty("next")
    private String next;

    @JsonProperty("previous")
    private String previous;

    @JsonProperty("count")
    private Integer count;

    @JsonProperty("results")
    private List<StarshipDTO> results;

    public String getNext(){
        return next;
    }

    public Object getPrevious(){
        return previous;
    }

    public Integer getCount(){
        return count;
    }

    public List<StarshipDTO> getResults(){
        return results;
    }

    @Override
     public String toString(){
        return 
            "StarshipsRepository{" + 
            "next = '" + next + '\'' + 
            ",previous = '" + previous + '\'' + 
            ",count = '" + count + '\'' + 
            ",results = '" + results + '\'' + 
            "}";
    }

    public boolean checkResultsCountIsValid() {

        String nextLink = next;
        int expectedCount = count;

        if ( nextLink == null ) {
            return expectedCount == results.size();
        }

        // Visit each link and accumulate the results length, check against count
        int resultsCount = results.size();

        while( nextLink != null ) {

            ObjectMapper objectMapper = new ObjectMapper();

            StarshipsRepository dto = null;
            try {
                dto = objectMapper.readValue(new URL(nextLink), StarshipsRepository.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            resultsCount += dto.results.size();
            nextLink = dto.next;
        }
        return expectedCount == resultsCount;
    }
}