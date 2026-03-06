package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    

    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city from the list
     * @param city
     * The city to be deleted
     */
    public void delete(City city) {
        if (cities.contains(city)){
            cities.remove(city);
        }
        else
        {
            throw new IllegalArgumentException("City is not in the list");
        }

    }
    /**
     * Gets the count of the cities
     * @return
     * city count
     */
    public int countCities(){
        return cities.size();
    }
}
