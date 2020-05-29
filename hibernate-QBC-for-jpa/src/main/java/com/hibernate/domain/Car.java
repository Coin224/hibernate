package com.hibernate.domain;

public class Car {
    private Integer cno;
    private String brand;
    private String color;


    public Car() {
    }

    public Car(Integer cno, String brand, String color) {
        this.cno = cno;
        this.brand = brand;
        this.color = color;
    }

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Car{" +
                "cno=" + cno +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
