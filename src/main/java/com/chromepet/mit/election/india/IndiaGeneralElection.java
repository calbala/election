package com.chromepet.mit.election.india;

import com.chromepet.mit.election.domain.GeneralElection;
import com.chromepet.mit.election.domain.authority.ElectionAuthority;
import com.chromepet.mit.election.domain.geography.Country;
import com.chromepet.mit.election.domain.geography.State;

public class IndiaGeneralElection {

    public static void main(String[] args) {
        System.out.println("Indian General Election");
        Country india = new Country("India");
        State tamilnadu = new State(india, "Tamilnadu");
        ElectionAuthority electionAuthority = new ElectionAuthority(india, tamilnadu, "Election Commission of India");
        electionAuthority.setAuthorityTitle("Chief Election Commissioner");
        electionAuthority.setAuthorityName("Rajiv Kumar");

        GeneralElection election = new GeneralElection(india, tamilnadu, electionAuthority);
        System.out.println(election.toString());
    }
}
