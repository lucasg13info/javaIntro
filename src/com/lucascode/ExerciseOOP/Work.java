package com.lucascode.ExerciseOOP;

import java.math.BigDecimal;
import java.util.Objects;

public class Work {
    private String role;
    private BigDecimal salary;
    private Stack stack;


    public Work(String role, double salary, Stack stack) {
        this.role = role;
        //this.salary = salary;
        this.stack = stack;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Stack getStack() {
        return stack;
    }

    public void setStack(Stack stack) {
        this.stack = stack;
    }

    @Override
    public String toString() {
        return "Work{" +
                "role='" + role + '\'' +
                ", salary=" + salary +
                ", stack=" + stack +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Work work = (Work) o;
        return Objects.equals(role, work.role) && Objects.equals(salary, work.salary) && stack == work.stack;
    }

    @Override
    public int hashCode() {
        return Objects.hash(role, salary, stack);
    }
}


