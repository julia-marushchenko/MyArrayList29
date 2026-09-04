/**
 *  Java program to print people's data with an age restriction.
 */

package com.mycollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an ArrayList to store Person type values.
        List<Person> people = new ArrayList<>();

        // Adding elements.
        Person p = new Person("Anna", 2);
        Person p1 = new Person("Steve", 5);
        Person p2 = new Person("Dave", 16);
        Person p3 = new Person("Ani", 17);
        Person p4 = new Person("Ben", 21);
        Person p5 = new Person("Sophia", 25);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);

        // Print the number of people and the persons themself.
        Scanner scanner = new Scanner(System.in);

        int age = Integer.valueOf(scanner.nextLine());

        for (Person el : people) {
            if(el.getAge() > age) {
                System.out.println(el);
            }
        }
    }
}

/**
 *  Person class.
 */
class Person {
    String name;
    int age;

    // Constructor of Person class.
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters.
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

    // Equals and hashCode.

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // ToString.
    @Override
    public String toString() {
        return "Person: " +
                "name='" + name + '\'' +
                ", age=" + age;
    }
}