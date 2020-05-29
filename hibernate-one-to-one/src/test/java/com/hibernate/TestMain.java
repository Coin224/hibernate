package com.hibernate;

import com.hibernate.dao.PersonDao;
import org.junit.Test;

public class TestMain {

    private PersonDao dao = new PersonDao();


    @Test
    public void t1(){
        dao.save1();
    }

    @Test
    public void delete1(){
        dao.delete1();
    }
}
