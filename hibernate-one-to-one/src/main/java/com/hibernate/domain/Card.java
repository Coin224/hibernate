package com.hibernate.domain;

import java.io.Serializable;

public class Card implements Serializable {


    /*基本属性*/
    private Integer cid;
    private Integer cno;
    private String address;

     /*关联属性*/
    private Person person;


    public Card() {
    }

    public Card(Integer cid, Integer cno, String address) {
        this.cid = cid;
        this.cno = cno;
        this.address = address;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
