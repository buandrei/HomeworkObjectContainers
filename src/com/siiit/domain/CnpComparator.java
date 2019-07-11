package com.siiit.domain;

import java.util.Comparator;

public class CnpComparator implements Comparator<Persoane> {
    @Override
    public int compare(Persoane p1, Persoane p2) {
        return p1.getCnp().compareTo(p2.getCnp());
    }
}
