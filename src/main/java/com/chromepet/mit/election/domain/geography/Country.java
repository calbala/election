package com.chromepet.mit.election.domain.geography;

public class Country {
    private final String countryName;

    public Country(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                '}';
    }
}
