package com.siiit.domain;


import java.util.Objects;

public class Persoane {

    private String name;
    private String cnp;
    private int age;
    private String porecla;


    public Persoane() {

    }

    public Persoane(String name, String cnp, int age, String porecla) {
        this.name = name;
        this.cnp = cnp;
        this.age = age;
        this.porecla = porecla;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPorecla() {
        return porecla;
    }

    public void setPorecla(String porecla) {
        this.porecla = porecla;
    }

    @Override
    public String toString() {
        return "Persoane{" +
                "name='" + name + '\'' +
                ", cnp='" + cnp + '\'' +
                ", age=" + age + '\'' +
                ", porecla=" + porecla +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoane persoane = (Persoane) o;
        return age == persoane.age &&
                Objects.equals(name, persoane.name) &&
                Objects.equals(cnp, persoane.cnp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cnp, age);
    }
}
