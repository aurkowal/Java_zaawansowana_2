package pl.coderslab.advanced.stream;

import java.time.LocalDate;
import java.time.Period;
import java.util.LinkedList;
import java.util.List;

public class Main02 {

    public static void main(String[] args) {
        List<Employee> list = new LinkedList<>();
        list.add(new Employee("Marcin", "Cieślak", "M", LocalDate.of(1983, 1, 1), 1000));
        list.add(new Employee("Natalia", "Nawrot", "F", LocalDate.of(1985, 1, 1), 2000));
        list.add(new Employee("Alina", "Wasilewska", "F", LocalDate.of(1995, 10, 10), 3000));
        list.add(new Employee("Katarzyna", "Skoczylas", "F", LocalDate.of(1996, 10, 10), 4000));

        list.stream().filter(e -> e.getLastName().startsWith("N")).forEach(e -> System.out.println(e));
        System.out.println("------");

        LocalDate now = LocalDate.now();

        list.stream().filter(e -> {
            int age = Period.between(e.getBirthDate(), now).getYears();
            return age >= 30 && age < 45;
        }).forEach(e -> System.out.println(e));
        System.out.println("------");

        list.stream().filter(e -> {
            int age = Period.between(e.getBirthDate(), now).getYears();
            return age >= 30 && age < 45 && e.getSalary() <= 3500 && e.getSex().equals("F");
        }).forEach(e -> {
            int salary = e.getSalary();
            Double newSalary = salary * 1.05;
            e.setSalary(newSalary.intValue());
        });

        list.forEach(e -> System.out.println(e));
    }
}
