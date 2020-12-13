package ru.mirea.practice9_10;

import java.util.Objects;

public class Employee implements EmployeePosition {
    private String surname;
    private String name;

    public Employee(String name, String surname) {
        this.surname = surname;
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getJobTitle() {
        return null;
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }

    public boolean equals(Employee o) {
        if (this.hashCode() == o.hashCode()) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return  false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() +  surname.hashCode();
    }
}
