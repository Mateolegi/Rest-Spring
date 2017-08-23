package com.mateolegi.Maps.Model;

/**
 * Created by mateo on 22/08/2017.
 */
public class Position {

    private final Long id;
    private Double latitude;
    private Double longitude;

    public Position(Long id, Double latitude, Double longitude) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
