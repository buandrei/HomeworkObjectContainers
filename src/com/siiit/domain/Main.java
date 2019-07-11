package com.siiit.domain;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //getPersoane();
        //getPersoaneArrayList();
        //getPersoaneLinkedList();
        //getPersoaneHashSet();
        //getPersoaneHashMap();
        //getPersoaneComparable();
        assigmentNo1();
        assigmentNo2();
    }


    private static void getPersoane() {

        Persoane[] persons = new Persoane[3];
        persons[0] = new Somer("Vasile", "32167537621", 29, "Vas");
        persons[1] = new Angajat("Ionel", "1241243543", 32, "Ion");
        persons[2] = new Student("Marcel", "312515251", 12, "Mar");


        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].getName());
        }
    }


    private static void getPersoaneArrayList() {

        System.out.println("~ArrayList~");

        List<Persoane> persoane = new ArrayList<>();

        persoane.add(new Somer("Ionel", "171531232", 30, "Ion"));
        persoane.add(new Angajat("Vasile", "181192382", 20, "Vas"));
        persoane.add(new Student("Marcel", "193929239", 19, "Mar"));


        for (int i = 0; i < persoane.size(); i++) {
            System.out.println(persoane.get(i).getName());
        }

        System.out.println("\n\n");
    }

    private static void getPersoaneLinkedList() {

        System.out.println("~LinkedList~");

        List<Persoane> persoane = new LinkedList<>();

        persoane.add(new Somer("Ionel", "171531232", 30, "Ion"));
        persoane.add(new Angajat("Vasile", "181192382", 20, "Vas"));
        persoane.add(new Student("Marcel", "193929239", 19, "Mar"));


        for (int i = 0; i < persoane.size(); i++) {
            System.out.print(persoane.get(i).getName());
            System.out.print(" , age: " + persoane.get(i).getAge() + "\n");
        }

        System.out.println("\n\n");
    }

    private static void getPersoaneHashSet() {
        System.out.println("~HashSet~");

        HashSet<Persoane> p12 = new HashSet<>();

        Persoane somer = new Somer("Ionel", "171531232", 30, "Ion");
        Persoane angajat = new Angajat("Vasile", "193929239", 30, "Vas");
        Persoane student = new Student("Marcel", "193929239", 30, "Mar");
        Persoane student1 = new Student("Marcel", "193929239", 30, "Mar");

        p12.add(somer);
        p12.add(angajat);
        p12.add(student);

        if (student1.equals(student)) {
            System.out.println("Persoanele sunt egale!");
        }


        for (Persoane p1 : p12) {
            System.out.println(p1.getName() + " , age:" + p1.getAge());
        }

        System.out.println("\n\n");

    }

    private static void getPersoaneHashMap() {
        System.out.println("~HashMap~");

        Map<String, Persoane> myPeople = new HashMap<>();

        Persoane somer = new Somer("Ionel", "171531232", 30, "Ion");
        Persoane angajat = new Angajat("Vasile", "193929239", 30, "Vas");
        Persoane student = new Student("Marcel", "193929239", 30, "Mar");


        myPeople.put("Ion", somer);

        myPeople.put("Vas", angajat);
        myPeople.put("Mar", student);

        // System.out.println(myPeople.get("Vas"));

        for (String key : myPeople.keySet()) {
            System.out.println(myPeople.get(key));
        }

        System.out.println("\n");

        for (Persoane persoana : myPeople.values()) {
            System.out.println(persoana);
        }
        System.out.println("\n");

        for (Map.Entry<String, Persoane> entry : myPeople.entrySet()) {
            System.out.println(entry);
        }
    }


    private static void getPersoaneComparable() {
        System.out.println("~Comparable~");

        Set<Persoane> mySet = new TreeSet<>(new CnpComparator());

        Persoane somer = new Somer("Ionel", "171531232", 30, "Ion");
        Persoane angajat = new Angajat("Asile", "123929239", 30, "Vas");
        Persoane student = new Student("Marcel", "193929239", 30, "Mar");

        mySet.add(somer);
        mySet.add(angajat);
        mySet.add(student);

        for (Persoane p1 : mySet) {
            System.out.println();
        }

     /*   Collections.sort(mySet, new Comparator<Persoane>() {
            @Override
            public int compare(Persoane p1, Persoane p2) {
                return p1.getCnp().compareTo(p2.getCnp());
            }
        });
        System.out.println("\nAfter");
        System.out.println(mySet);
    */
    }

    private static void assigmentNo1() {

        System.out.println("\n~~AssigmentNo1~~");
        System.out.println("~~Name comparator~~");

        Set<Persoane> nameSet = new TreeSet<>(new NameComparator());

        Persoane somer = new Somer("Ionel", "171531232", 12, "Ion");
        Persoane angajat = new Angajat("Asile", "123929239", 34, "Vas");
        Persoane student = new Student("Marcel", "193929239", 14, "Mar");

        nameSet.add(somer);
        nameSet.add(angajat);
        nameSet.add(student);

        for (Persoane p1 : nameSet) {
            System.out.println("Name: " + p1.getName() + ",age: " + p1.getAge());
        }

        System.out.println("\n~~Age comparator~~");

        Set<Persoane> ageSet = new TreeSet<>(new AgeComparator());

        ageSet.add(somer);
        ageSet.add(angajat);
        ageSet.add(student);

        for (Persoane p1 : ageSet) {
            System.out.println("Name: " + p1.getName() + ",age: " + p1.getAge());
        }
    }

    private static void assigmentNo2() {
        System.out.println("\n~~AssigmentNo2~~");

        Persoane somer = new Somer("Ionel", "171531232", 12, "Ion");
        Persoane angajat = new Angajat("Asile", "123929239", 34, "Vas");
        Persoane student = new Student("Marcel", "193929239", 14, "Mar");

        Map<Persoane, List<Hobbies>> myMap = new HashMap<>();

        System.out.println();

        myMap.put(somer, setHobbies(3));
        myMap.put(angajat, setHobbies(1));
        myMap.put(student, setHobbies(2));


        for (Persoane key : myMap.keySet()) {
            System.out.println(myMap.get(key));
        }

    }

    private static List<Hobbies> setHobbies(int contor) {

        Tara tara1 = new Tara("Romania");
        Tara tara2 = new Tara("Franta");
        Tara tara3 = new Tara("Italia");
        Tara tara4 = new Tara("Spania");

        List<Tara> countryPracticed = new ArrayList<>();
        List<Tara> countryPracticed2 = new ArrayList<>();
        List<Tara> countryPracticed3 = new ArrayList<>();

        countryPracticed.add(tara1);
        countryPracticed.add(tara2);

        countryPracticed2.add(tara2);
        countryPracticed2.add(tara3);

        countryPracticed3.add(tara4);
        countryPracticed3.add(tara3);
        countryPracticed3.add(tara1);

        List<Adresa> adresaList1 = new ArrayList<>();
        List<Adresa> adresaList2 = new ArrayList<>();
        List<Adresa> adresaList3 = new ArrayList<>();

        Adresa adresa1 = new Adresa("Strada Unirii nr1", countryPracticed);
        Adresa adresa2 = new Adresa("4941 Cooks Mine Road", countryPracticed2);
        Adresa adresa3 = new Adresa("4470 Juniper Drive", countryPracticed3);

        adresaList1.add(adresa1);
        adresaList2.add(adresa2);
        adresaList3.add(adresa3);

        Hobbies hFishing = new Hobbies("Fishing", 3, adresaList1);
        Hobbies hHunting = new Hobbies("Hunting", 2, adresaList2);
        Hobbies hCycling = new Hobbies("Cycling", 6, adresaList3);

        List<Hobbies> hobby1 = new ArrayList<>();
        List<Hobbies> hobby2 = new ArrayList<>();
        List<Hobbies> hobby3 = new ArrayList<>();

        hobby1.add(hFishing);
        hobby2.add(hHunting);
        hobby3.add(hCycling);


        if (contor == 1) {
            return hobby1;
        } else if (contor == 2) {
            return hobby2;
        } else {
            return hobby3;
        }
    }


}
