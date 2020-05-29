package com.hibernate.domain;

import java.util.Set;

public class Student {


    /*基本属性*/
    private Integer sno;
    private String sname;
    private Integer age;

    /*关联属性*/
    private Set<Teacher> teachers;

    public Student() {
    }

    public Student(String sname, Integer age) {
        this.sname = sname;
        this.age = age;
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }
}
