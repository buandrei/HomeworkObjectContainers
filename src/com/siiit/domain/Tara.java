package com.siiit.domain;

public class Tara {
    public String name;

    public Tara() {

    }

    public Tara(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tara{" +
                "name='" + name + '\'' +
                '}';
    }
}
