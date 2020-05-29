package com.hibernate.domain;

import java.io.Serializable;

public class Emp implements Serializable {


    //先写上和表格字段相同的属性
    private Integer eno;
    private String ename;
    private Integer sal;
    private Integer dno;


    //一个员工对应一个部门
    private Dept dept;

    public Emp() {
    }

    public Emp(Integer eno, String ename, Integer sal, Integer dno) {
        this.eno = eno;
        this.ename = ename;
        this.sal = sal;
        this.dno = dno;
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public Integer getDno() {
        return dno;
    }

    public void setDno(Integer dno) {
        this.dno = dno;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
