package com.example.mylocations;


public class Geolocation {

    private double longitude, latitude;

    public Geolocation(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Longitude: " + longitude + ", Latitude: " + latitude;
    }

    public double distance(Geolocation position) {
        final double EARTH_RADIUS = 6371000; // In metters

        double dLat = Math.toRadians(latitude - position.latitude);
        double dLon = Math.toRadians(longitude - position.longitude);

        double lat1 = Math.toRadians(position.latitude);
        double lat2 = Math.toRadians(latitude);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.sin(dLon / 2) * Math.sin(dLon / 2) *
                        Math.cos(lat1) * Math.cos(lat2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return c * EARTH_RADIUS;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
