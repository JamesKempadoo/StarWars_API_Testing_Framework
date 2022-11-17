package org.mtfbwy.spartanapi.framework.services;

import java.util.List;
import java.util.regex.Pattern;

public class Util  {
    public static boolean linkChecker(List<String> list, String request) {
        for (String item : list) {
            if (!Pattern.matches("https://swapi.dev/api/"+request+"/+\\d+/", item)) {
                return true;
            }
        }
        return false;
    }
}
