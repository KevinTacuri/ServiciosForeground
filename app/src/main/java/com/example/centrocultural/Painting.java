package com.example.centrocultural;

public class Painting {
    private String name;
    private int imageResId;
    private String description;
    private String artist;
    private String year;

    public Painting(String name, int imageResId, String description, String artist, String year) {
        this.name = name;
        this.imageResId = imageResId;
        this.description = description;
        this.artist = artist;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getDescription() {
        return description;
    }

    public String getArtist() {
        return artist;
    }

    public String getYear() {
        return year;
    }
}
