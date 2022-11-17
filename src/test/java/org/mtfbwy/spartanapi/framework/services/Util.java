package org.mtfbwy.spartanapi.framework.services;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.regex.Pattern;

public class Util  {
    public static boolean linkChecker(List<String> list, Endpoint endpoint) {
        for (String item : list) {
            if (!Pattern.matches("https://swapi.dev/api/"+endpoint.label+"/+\\d+/", item)) {
                return true;
            }
        }
        return false;
    }

    public static ZonedDateTime stringToZDT(String string){
        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE_TIME;
        ZonedDateTime zdt = ZonedDateTime.parse(string,dtf);
        return zdt;
    }



}
