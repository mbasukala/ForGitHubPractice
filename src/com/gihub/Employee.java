package com.gihub;

import java.util.List;

public class Employee {
    private String empFirstName;
    private String empLastName;
    private List<EmployeeAddress> empAddress;
    private int empNumber;
    private char gender;
    private int age;
    private long contactNumber;

    public Employee(String empFirstName, String empLastName, List<EmployeeAddress> empAddress, int empNumber, char gender, int age, long contactNumber) {
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.empAddress = empAddress;
        this.empNumber = empNumber;
        this.gender = gender;
        this.age = age;
        this.contactNumber = contactNumber;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public List<EmployeeAddress> getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(List<EmployeeAddress> empAddress) {
        this.empAddress = empAddress;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }
}
