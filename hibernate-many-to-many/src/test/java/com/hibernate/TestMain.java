package com.hibernate;

import com.hibernate.dao.TeacherDao;
import org.junit.Test;

public class TestMain {

    @Test
    public void t1() {
        TeacherDao dao = new TeacherDao();
        dao.save();
    }

    @Test
    public void t2() {
        TeacherDao dao = new TeacherDao();
        dao.find();
    }
}
