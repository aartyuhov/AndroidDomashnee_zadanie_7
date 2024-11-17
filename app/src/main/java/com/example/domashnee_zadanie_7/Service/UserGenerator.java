package com.example.domashnee_zadanie_7.Service;

import com.example.domashnee_zadanie_7.Models.User;
import com.example.domashnee_zadanie_7.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserGenerator {
    private static final String[] NAMES = {"John", "Jane", "Alice", "Bob", "Eve"};
    private static final String[] SURNAMES = {"Smith", "Doe", "Brown", "Johnson", "Williams"};
    private static final String[] COUNTRIES = {"USA", "Canada", "UK", "Germany", "France"};
    private static final String[] CITIES = {"New York", "Toronto", "London", "Berlin", "Paris"};

    static int[] avatars = {R.drawable.avatar1, R.drawable.avatar2, R.drawable.avatar3};

    private static final int count = 100;

    public static List<User> generateUsers() {
        List<User> users = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= count; i++) {
            int avatarResId = avatars[random.nextInt(avatars.length)];
            String name = NAMES[random.nextInt(NAMES.length)];
            String surname = SURNAMES[random.nextInt(SURNAMES.length)];
            String country = COUNTRIES[random.nextInt(COUNTRIES.length)];
            String city = CITIES[random.nextInt(CITIES.length)];
            long age = System.currentTimeMillis() - (random.nextInt(30) + 20) * 365L * 24 * 60 * 60 * 1000;

            users.add(new User(i, avatarResId, name, surname, country, city, age));
        }
        return users;
    }
}
