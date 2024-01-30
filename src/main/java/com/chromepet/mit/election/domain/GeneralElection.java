package com.chromepet.mit.election.domain;

import com.chromepet.mit.election.domain.authority.ElectionAuthority;
import com.chromepet.mit.election.domain.geography.Country;
import com.chromepet.mit.election.domain.geography.State;

public class GeneralElection {
    private final Country country;
    private final State state;
    private final ElectionAuthority electionAuthority;

    public GeneralElection(Country country, State state, ElectionAuthority electionAuthority) {
        this.country = country;
        this.state = state;
        this.electionAuthority = electionAuthority;
    }

    @Override
    public String toString() {
        return "GeneralElection{" +
                "country=" + country +
                ", state=" + state +
                ", electionAuthority=" + electionAuthority +
                '}';
    }
}
