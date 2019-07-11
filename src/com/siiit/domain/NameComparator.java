package com.siiit.domain;

import java.util.Comparator;

public class NameComparator implements Comparator<Persoane> {

    @Override
    public int compare(Persoane o1, Persoane o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
