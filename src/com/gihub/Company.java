package com.gihub;

import java.util.List;

public class Company {
    private String name;
    private int branchCount;
    private int regNumber;
    private List<Employee> employees;

    public Company(String name, int branchCount, int regNumber, List<Employee> employee) {
        this.name = name;
        this.branchCount = branchCount;
        this.regNumber = regNumber;
        this.employees = employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public List<Employee> getEmployee() {
        return employees;
    }

    public void setEmployee(List<Employee> employee) {
        this.employees = employee;
    }
}
