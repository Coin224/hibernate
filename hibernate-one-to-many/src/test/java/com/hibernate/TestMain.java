package com.hibernate;

import com.hibernate.dao.DeptDao;
import org.junit.Test;

public class TestMain {
    private DeptDao dao = new DeptDao();

    @Test
    public void t1() {
        dao.save();
    }

    @Test
    public void t2() {
        dao.find1();
    }
}
