package com.company;

public class Person {
    String fullName;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Person(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "fullName: " + fullName + ", position: " + position + ", email: " + email +
                ", phone: " + phone + ", salary: " + salary + ", age: " + age;
    }
}
