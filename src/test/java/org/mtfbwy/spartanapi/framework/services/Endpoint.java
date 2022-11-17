package org.mtfbwy.spartanapi.framework.services;

public enum Endpoints {
    PEOPLE("people"),
    FILMS("films"),
    PLANETS("planets"),
    STARSHIPS("starships"),
    VEHICLES("vehicles"),
    SPECIES("species");

    public final String label;
    Endpoint(String label){
        this.label = label;
    }
}
