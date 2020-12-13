package ru.mirea.practice9_10;

public interface EmployeePosition {
    String getJobTitle(); //метод String getJobTitle(), возвращающий название занимаемой должности
    double calcSalary(double baseSalary); //метод  double calcSalary(double baseSalary), возвращающий зарплату сотрудника, в соответствии с фиксированным окладом.
}
