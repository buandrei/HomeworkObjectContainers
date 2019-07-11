package com.siiit.domain;


import java.util.ArrayList;
import java.util.List;

public class Adresa {
    public String name;
    public List<Tara> tara;

    public Adresa() {
    }


    public Adresa(String name, List<Tara> tara) {
        this.name = name;
        this.tara = tara;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tara> getTara() {
        return tara;
    }

    public void setTara(List<Tara> tara) {
        this.tara = tara;
    }

    @Override
    public String toString() {
        return "Adresa{" +
                "tara=" + tara +
                '}';
    }
}
