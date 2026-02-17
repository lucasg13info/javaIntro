package com.lucascode.ExerciseOOP;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {
    private String model;
    private String branch;
    private BigDecimal price;
    private Integer regoNum;
    private Color Color;
    private Integer year;

    public Car(String model, String branch, BigDecimal price, Integer regoNum, Color color, Integer year) {
        this.model = model;
        this.branch = branch;
        this.price = price;
        this.regoNum = regoNum;
        Color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getRegoNum() {
        return regoNum;
    }

    public void setRegoNum(Integer regoNum) {
        this.regoNum = regoNum;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color color) {
        Color = color;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", branch='" + branch + '\'' +
                ", price=" + price +
                ", regoNum=" + regoNum +
                ", Color=" + Color +
                ", year=" + year +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(branch, car.branch) && Objects.equals(price, car.price) && Objects.equals(regoNum, car.regoNum) && Color == car.Color && Objects.equals(year, car.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, branch, price, regoNum, Color, year);
    }
}
