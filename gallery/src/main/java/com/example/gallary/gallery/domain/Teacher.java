package com.example.gallary.gallery.domain;


import javax.persistence.*;

@Entity
@Table(name="Teacher")
public class Teacher extends Perpetual {


    @Column
    @Access(AccessType.FIELD)
    private String name;

    @Column
    @Access(AccessType.FIELD)

    private int age;

    @Column
    @Access(AccessType.FIELD)

    private String address;

    @Column
    @Access(AccessType.FIELD)
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
