package com.lucascode.ExerciseOOP;

import com.lucascode.OOP.Gender;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;
    private Integer passport;
    private String email;
    private String address;
    private Car [] cars;
    //private Work [] work;
    //private Dog [] dogs;

    //Constructors:


    public Person(String firstName, String lastName, Gender gender, Integer passport, String email, String address, Car[] cars) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.passport = passport;
        this.email = email;
        this.address = address;
        this.cars = cars;
    }

    //Getters and Setters:
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getPassport() {
        return passport;
    }

    public void setPassport(Integer passport) {
        this.passport = passport;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    //String
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", passport=" + passport +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }

    // Equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && gender == person.gender && Objects.equals(passport, person.passport) && Objects.equals(email, person.email) && Objects.equals(address, person.address) && Objects.deepEquals(cars, person.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, passport, email, address, Arrays.hashCode(cars));
    }
}
