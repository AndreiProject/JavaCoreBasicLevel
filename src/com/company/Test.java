package com.company;

public class Test {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan","Engineer", "ivivan@mailbox.com", "892312311", 30000, 30);
        persArray[1] = new Person("Andreev Andrey","Engineer", "andrey@mailbox.com", "892312312", 40000, 20);
        persArray[2] = new Person("Sergeev Sergey","Engineer", "sergey@mailbox.com", "892312313", 50000, 45);
        persArray[3] = new Person("Vitaliev Vitaliy","Engineer", "vitaliy@mailbox.com", "892312314", 60000, 40);
        persArray[4] = new Person("Maksimov Maksim","Engineer", "maksim@mailbox.com", "892312315", 70000, 50);

        for (Person person: persArray) {
            if (person.age > 40) {
                System.out.println(person);
            }
        }
    }
}