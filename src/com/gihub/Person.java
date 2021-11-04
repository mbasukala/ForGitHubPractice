package com.gihub;

public class Person {
    String firstName;
    String lastname;
    int age;
    char gender;
    String countryLocation;
    String highestDegree;
    String profession;

    public Person(String firstName, String lastname, int age, char gender, String countryLocation, String highestDegree, String profession) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.countryLocation = countryLocation;
        this.highestDegree = highestDegree;
        this.profession = profession;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getCountryLocation() {
        return countryLocation;
    }

    public void setCountryLocation(String countryLocation) {
        this.countryLocation = countryLocation;
    }

    public String getHighestDegree() {
        return highestDegree;
    }

    public void setHighestDegree(String highestDegree) {
        this.highestDegree = highestDegree;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }


}
