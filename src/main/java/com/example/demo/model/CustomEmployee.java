package com.example.demo.model;

import java.io.Serializable;

public class CustomEmployee implements Serializable {

    private String fname;
    private String lname;
    private Integer salary;

    public CustomEmployee(String fname, String lname, Integer salary) {
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
    }

    public String getFname() { return fname;
    }

    public void setFname(String FNAME) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String LNAME) {
        this.lname = lname;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

}
