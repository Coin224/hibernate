package com.hibernate.domain;

import java.util.Set;

public class Teacher {


    /*基本属性*/
    private Integer tno;
    private String tname;
    private Integer sal;

    /*关联属性*/
    private Set<Student> students;

    public Teacher() {
    }

    public Teacher(String tname, Integer sal) {
        this.tname = tname;
        this.sal = sal;
    }

    public Integer getTno() {
        return tno;
    }

    public void setTno(Integer tno) {
        this.tno = tno;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
