package com.klb.entity;

import org.springframework.data.annotation.Id;

/**
 * Created by klb on 21.08.18.
 */
public class Person {
    @Id
    private String id;
   	private int age;
   	private String salary;
    private String student;
    private String status;
    private String buyComp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBuyComp() {
        return buyComp;
    }

    public void setBuyComp(String buyComp) {
        this.buyComp = buyComp;
    }
}
