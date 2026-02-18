package com.lucascode.ExerciseOOP;

import com.lucascode.OOP.Gender;

import java.util.Arrays;
import java.util.Objects;

public class Person {

    public static int count = 0;

    //Executed by JVM when the class is involt, here could be the Database conection
    static {
        System.out.println("Start: Static initialization ");
        count = 0;
        System.out.println("Start: Static initialization ");

    }
    private String firstName;
    private String lastName;
    private Gender gender;
    private Integer passport;
    private String email;
    private String address;
    private Car [] cars;
    private Work [] work;
    private Pet [] pet;



    //Constructors:




    public Person(String firstName, String lastName, Gender gender, Integer passport, String email, String address, Car[] cars, Work work, Pet[] pet) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.passport = passport;
        this.email = email;
        this.address = address;
        this.cars = cars;
        this.work = new Work[]{work};
        this.pet = pet;
        count ++;
    }

    //Getters and Setters


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

    public Work[] getWork() {
        return work;
    }

    public void setWork(Work[] work) {
        this.work = work;
    }

    public Pet[] getPet() {
        return pet;
    }

    public void setPet(Pet[] pet) {
        this.pet = pet;
    }

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
                ", work=" + Arrays.toString(work) +
                ", pet=" + Arrays.toString(pet) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && gender == person.gender && Objects.equals(passport, person.passport) && Objects.equals(email, person.email) && Objects.equals(address, person.address) && Objects.deepEquals(cars, person.cars) && Objects.deepEquals(work, person.work) && Objects.deepEquals(pet, person.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, passport, email, address, Arrays.hashCode(cars), Arrays.hashCode(work), Arrays.hashCode(pet));
    }
}
