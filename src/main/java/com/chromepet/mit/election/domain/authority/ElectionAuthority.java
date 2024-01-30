package com.chromepet.mit.election.domain.authority;

import com.chromepet.mit.election.domain.geography.Country;
import com.chromepet.mit.election.domain.geography.State;

public class ElectionAuthority {
    private final Country country;
    private final State state;
    private final String organization;
    private String authorityTitle;
    private String authorityName;

    public ElectionAuthority(Country country, State state, String organization) {
        this.country = country;
        this.state = state;
        this.organization = organization;
    }

    public Country getCountry() {
        return country;
    }

    public State getState() {
        return state;
    }

    public String getOrganization() {
        return organization;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    public String getAuthorityTitle() {
        return authorityTitle;
    }

    public void setAuthorityTitle(String authorityTitle) {
        this.authorityTitle = authorityTitle;
    }


    @Override
    public String toString() {
        return "ElectionAuthority{" +
                "country=" + country +
                ", state=" + state +
                ", organization='" + organization + '\'' +
                ", authorityTitle='" + authorityTitle + '\'' +
                ", authorityName='" + authorityName + '\'' +
                '}';
    }
}
