package com.example.demo.model;
import javax.persistence.*;

@Entity
public class Department {

    @Id
    @Column(name = "dnumber")
    private Integer dnumber;

    @Column(name = "dname")
    private String dname;

    @Column(name = "mgrstartdate")
    private String mgrstartdate;

    @Column(name = "dlocation")
    private String dlocation;

    public Department() {
        super();
    }

    public Department(Integer dnumber, String dname, String mgrstartdate, String dlocation) {
        super();
        this.dnumber=dnumber;
        this.dname=dname;
        this.mgrstartdate=mgrstartdate;
        this.dlocation=dlocation;
    }

    public Integer getDnumber() {
        return dnumber;
    }

    public void setDnumber(Integer dnumber) {
        this.dnumber = dnumber;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getMgrstartdate() {
        return mgrstartdate;
    }

    public void setMgrstartdate(String mgrstartdate) {
        this.mgrstartdate = mgrstartdate;
    }

    public String getDlocation() {
        return dlocation;
    }

    public void setDlocation(String dlocation) {
        this.dlocation = dlocation;
    }



}
