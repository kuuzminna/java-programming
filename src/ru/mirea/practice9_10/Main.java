package ru.mirea.practice9_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main9_10{
    public static void main(String[] args) {
        Random random = new Random();
        int k = 0;
        int l = 1;
        ArrayList<Employee> workers = new ArrayList<Employee>();
        ArrayList<Employee> sallary = new ArrayList<Employee>();
        Company comp = new Company();
        while (k < 180) {
            Employee employee = new Operator("Jhon", "Sir" + toString(l));
            workers.add(employee);
            l++;
            k++;
        }
        k = 0;
        while (k < 80) {
            Employee employee = new Manager("Jhon", "Sir" + toString(l));
            workers.add(employee);
            l++;
            k++;
        }
        k = 0;
        while (k < 10) {
            Employee employee = new TopManager("Jhon", "Sir" + toString(l), comp.getIncome());
            workers.add(employee);
            l++;
            k++;
        }
        comp.hireall(workers);
        List<Employee> comp1 = comp.getTopSalaryStaff(1);
        for (int i = 0; i < 1; i++) {
            System.out.println((i + 1) + ".  " + comp1.get(i).calcSalary(comp.getBaseSalary()) + "руб");
        }
        System.out.println();
        List<Employee> comp2 = comp.getLowestSalaryStaff(1);
        for (int i = 0; i < 1; i++) {
            System.out.println((i + 1) + ".  " + comp2.get(i).calcSalary(comp.getBaseSalary()) + "руб");
        }
        for (int i = 0; i < (workers.size()/2); i++) {
            comp.fire("Jhon", "Sir" + toString(random.nextInt(30)));
        }
        ArrayList<Employee> workersAfterFire = new ArrayList<Employee>((workers.size()/2));
        workersAfterFire=comp.getEmpolies();
        System.out.println();
        k=0;
        for (Employee employee : workersAfterFire) {
            if (employee != null && employee.getSurname()!= null) {
                k++;
                System.out.println((k) + ".  " + employee.getSurname());
            }
        }
    }
    private static String toString(int k) {
        return Integer.toString(k);
    }
}