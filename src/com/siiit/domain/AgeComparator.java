package com.siiit.domain;

import java.util.Comparator;

public class AgeComparator implements Comparator<Persoane> {

    @Override
    public int compare(Persoane o1, Persoane o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else {
            return -1;
        }
    }
}
