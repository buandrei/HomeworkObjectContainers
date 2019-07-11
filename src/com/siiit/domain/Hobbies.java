package com.siiit.domain;

import java.util.ArrayList;
import java.util.List;

public class Hobbies{
    private String name;
    public int frequency;
    public List<Adresa> adresaList = new ArrayList<>();

    public  Hobbies(){}


    public Hobbies(String name, int frequency, List<Adresa> adresaList) {
        this.name = name;
        this.frequency = frequency;
        this.adresaList = adresaList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public List<Adresa> getAdresaList() {
        return adresaList;
    }

    public void setAdresaList(List<Adresa> adresaList) {
        this.adresaList = adresaList;
    }

    @Override
    public String toString() {
        return "Hobbies{" +
                "name='" + name + '\'' +
                ", adresaList=" + adresaList +
                '}';
    }
}
