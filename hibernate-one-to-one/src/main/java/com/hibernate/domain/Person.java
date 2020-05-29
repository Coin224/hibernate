package com.hibernate.domain;

import java.io.Serializable;

public class Person implements Serializable {
    private Integer pid;
    private String pname;
    private Integer age;


    private Card card;


    public Person() {
    }

    public Person(Integer pid, String pname, Integer age) {
        this.pid = pid;
        this.pname = pname;
        this.age = age;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
