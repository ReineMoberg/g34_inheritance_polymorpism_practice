package se.lexicon.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Employee {

    private int id;
    private String name;
    private double salary;
    private LocalDate dateHired;


    public abstract void calculateSalary();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(dateHired, employee.dateHired);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, dateHired);
    }

    @Override
    public String toString() {

        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + (int) salary +
                ", dateHired=" + dateHired +
                '}';
    }
}
