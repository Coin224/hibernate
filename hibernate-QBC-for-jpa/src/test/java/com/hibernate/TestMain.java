package com.hibernate;

import com.hibernate.dao.CarDao;
import org.junit.Test;

public class TestMain {


    private CarDao dao = new CarDao();


    @Test
    public void save(){
        //QBC for JPA
        dao.save();
    }



    @Test
    public void t1(){
        //QBC for JPA
        dao.getCarList();
    }


    @Test
    public void t2(){
        //QBC for JPA

        dao.getCar();
    }


    @Test
    public void t3(){
        //QBC for JPA

        dao.getOrderBy();
    }

    @Test
    public void find1(){
        //QBC for JPA

        dao.find1();
    }

}
