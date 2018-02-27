package com.example.mylocations;

public class Place {

    private String name;
    private String address;
    private Geolocation position; // GeoPunto class
    private String photo;
    private int phone;
    private String url;
    private String annotation; // This is a commentary
    private long date;
    private float rank; // This is an assessment about the place

    public Place(String name, String address, double longitude,double latitude, int phone, String url, String annotation, int rank) {
        date = System.currentTimeMillis();
        position = new Geolocation(longitude, latitude);
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.url = url;
        this.annotation = annotation;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Geolocation getPosition() {
        return position;
    }

    public void setPosition(Geolocation position) {
        this.position = position;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public float getRank() {
        return rank;
    }

    public void setRank(float rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Place {" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", position=" + position +
                ", photo='" + photo + '\'' +
                ", phone=" + phone +
                ", url='" + url + '\'' +
                ", annotation='" + annotation + '\'' +
                ", date=" + date +
                ", rank=" + rank +
                '}';
    }
}
