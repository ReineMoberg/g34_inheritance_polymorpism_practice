package se.lexicon.model;

import java.time.LocalDate;             //To show date in formatted way
import java.time.LocalDateTime;
import java.util.Objects;               //Utility methods for operating on objects (compare, to string, hashcode,....)

public abstract class Employee {        //Abstract class. Can not be instantiated

    private int id;                     //Class field. Access from this class/inherent class/object only
    private String name;
    private double salary;
    private LocalDate dateHired;


    public abstract void calculateSalary();     //Abstract method. Inherent class must provide implementation

    //Getters and setters
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


    //Methods that overrides super class methods (must have same name, return type and parameters as superclass')
    @Override
    public boolean equals(Object o) {       //For being able to compare values in object to another object
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(dateHired, employee.dateHired);
    }

    @Override
    public int hashCode() {                 //Return hashcode for variables in object
        return Objects.hash(id, name, salary, dateHired);
    }

    @Override
    public String toString() {              //Return object variable content as a string

        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + (int) salary +
                ", dateHired=" + dateHired +
                '}';
    }
}
