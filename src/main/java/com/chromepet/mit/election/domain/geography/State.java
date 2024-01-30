package com.chromepet.mit.election.domain.geography;

public class State {
    private final Country country;
    private final String stateName;

    public State(Country country, String stateName) {
        this.country = country;
        this.stateName = stateName;
    }

    @Override
    public String toString() {
        return "State{" +
                "country=" + country +
                ", stateName='" + stateName + '\'' +
                '}';
    }
}
