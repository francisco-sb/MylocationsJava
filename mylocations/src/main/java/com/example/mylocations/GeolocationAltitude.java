package com.example.mylocations;

public class GeolocationAltitude extends Geolocation {

    private double altitude;

    public GeolocationAltitude(double longitude, double latitude, double altitude) {
        super(longitude, latitude);
        this.altitude = altitude;
    }

    @Override
    public double distance(Geolocation position) {
        double oldDistance = super.distance(position);

        return oldDistance;
    }
}
