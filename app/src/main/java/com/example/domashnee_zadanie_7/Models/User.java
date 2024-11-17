package com.example.domashnee_zadanie_7.Models;

public class User {
    private int id;
    private int avatarResId;
    private String name;
    private String surname;
    private String country;
    private String city;
    private long age;

    public User(int id, int avatarResId, String name, String surname, String country, String city, long age) {
        this.id = id;
        this.avatarResId = avatarResId;
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.city = city;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAvatarResId() {
        return avatarResId;
    }

    public void setAvatarResId(int avatarResId) {
        this.avatarResId = avatarResId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }
}
