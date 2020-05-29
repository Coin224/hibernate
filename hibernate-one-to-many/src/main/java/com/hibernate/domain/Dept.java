package com.hibernate.domain;

import java.io.Serializable;
import java.util.Set;

public class Dept implements Serializable {
    private Integer dno;
    private String dname;


    //一个部门对应多个员工
    private Set<Emp> emps;


    public Dept() {
    }

    public Dept(Integer dno, String dname) {
        this.dno = dno;
        this.dname = dname;
    }


    public Integer getDno() {
        return dno;
    }

    public void setDno(Integer dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Set<Emp> getEmps() {
        return emps;
    }

    public void setEmps(Set<Emp> emps) {
        this.emps = emps;
    }
}
