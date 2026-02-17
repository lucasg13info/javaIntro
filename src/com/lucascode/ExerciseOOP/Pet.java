package com.lucascode.ExerciseOOP;

import java.util.Objects;

public class Pet {
    private PetType petType;
    private String name;
    private Integer age;



    public Pet(PetType petType, String name, Integer age) {
        this.petType = petType;
        this.name = name;
        this.age = age;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petType='" + petType + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(petType, pet.petType) && Objects.equals(name, pet.name) && Objects.equals(age, pet.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(petType, name, age);
    }
}
